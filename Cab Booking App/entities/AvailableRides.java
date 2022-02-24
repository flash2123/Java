package model.rides;

import java.util.HashMap;

public class AvailableRides {
    private static HashMap<Ride, Boolean> availableRides;

    public AvailableRides() {
        availableRides = new HashMap<>();
    }

    public static HashMap<Ride, Boolean> getAvailableRides() {
        return availableRides;
    }
}
