package model.driver;

import model.Location;
import model.Vehicle;
import model.user.User;

public class Driver extends User {

    private boolean availableStatus;
    private Vehicle vehicle;

    public Driver(String userName, Location location, long contactNumber) {
        super(userName, location, contactNumber);
    }

    public Driver(String userName) {
        super(userName);
    }
}
