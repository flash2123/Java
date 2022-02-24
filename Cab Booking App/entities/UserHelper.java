package model.user;

import model.Location;
import model.exceptions.SameUserException;
import model.exceptions.UserAlreadyRegisteredException;
import model.exceptions.UserNotFoundException;
import model.rides.AvailableRides;
import model.rides.Ride;

import java.util.HashSet;
import java.util.List;

public class UserHelper {

    private final HashSet<User> users;

    public UserHelper() {
        this.users = new HashSet<>();
    }

    public HashSet<User> getUsers() {
        return users;
    }

    public boolean addUser(User user) throws UserAlreadyRegisteredException {
        if (users.contains(user)) {
            throw new UserAlreadyRegisteredException(user.getUserName() + " is already registered!");
        }
        return users.add(user);
    }

    public boolean updateUser(String userName, User user) {
        User userInList = null;
        try {
            userInList = findUserInDataStore(userName);
            try {
                userInList.editDetails(user);
            } catch (SameUserException e) {
                System.err.println("The same user is already present!");
            }
        } catch (UserNotFoundException e) {
            System.err.println(userName + " Not found!");
        }
        return true;
    }

    private User findUserInDataStore(String userName) throws UserNotFoundException {
        var userInList = users.stream()
                .filter(registeredUser -> userName.equals(registeredUser.getUserName()))
                .findFirst();
        if (userInList.isPresent()) {
            return userInList.get();
        } else {
            throw new UserNotFoundException();
        }
    }

    public boolean updateUserLocation(String userName, Location location) {
        try {
            var user = findUserInDataStore(userName);
            user.setLocation(location);
        } catch (UserNotFoundException e) {
            System.err.println(userName + " Not found!");
        }
        return true;
    }

    public List<Ride> findRide(String userName, Location source, Location destination) {
        return AvailableRides.getAvailableRides()
                .keySet()
                .stream()
                .filter(ride -> source.equals(ride.getSource()) &&
                        destination.equals(ride.getDestination()))
                .map(ride -> new Ride(ride.getSource(), ride.getDestination(), ride.isAvailableStatus()))
                .toList();
    }

    public boolean chooseRide(String userName, String driverName) {
        AvailableRides.getAvailableRides()
                .keySet()
                .stream()
                .filter(ride -> driverName.equals(ride.getDriver().getUserName()))
                .findFirst()
                .ifPresent(ride -> ride.setStatus(false));
        return true;
    }
}
