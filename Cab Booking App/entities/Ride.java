package model.rides;

import model.Location;
import model.driver.Driver;

public class Ride {
    private Driver driver;
    private boolean status;
    private Location source;
    private Location destination;

    public Ride(Driver driver) {
        this.driver = driver;
        this.source = new Location(0, 0);
        this.destination = new Location(0, 0);
        this.status = false;
    }

    public Ride(Location source, Location destination, boolean status) {
        this.source = source;
        this.destination = destination;
        this.status = status;
        this.driver = new Driver("DUMMYDRIVER");
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public boolean isAvailableStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }


}
