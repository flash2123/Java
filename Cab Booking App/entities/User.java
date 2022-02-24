package model.user;

import model.Location;
import model.exceptions.SameUserException;

import java.util.Objects;

public class User {
    private String userName;
    private Location location;
    private long contactNumber;

    public User(String userName, Location location, long contactNumber) {
        this.userName = userName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public User(String userName) {
        this.userName = userName;
        this.location = new Location(0, 0);
        this.contactNumber = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean editDetails(User user) throws SameUserException {
        if (this.equals(user)) {
            throw new SameUserException(user.getUserName() + " has same details!");
        }
        this.userName = user.userName;
        this.contactNumber = user.contactNumber;
        this.location = user.location;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return contactNumber == user.contactNumber && Objects.equals(userName, user.userName) && Objects.equals(location, user.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, location, contactNumber);
    }

    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", location=" + location + ", contactNumber=" + contactNumber + '}';
    }
}
