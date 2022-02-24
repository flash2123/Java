package model;

import java.util.Objects;

public class Vehicle {
    private String name;
    private String licensePlateNumber;

    public Vehicle(String name, String licensePlateNumber) {
        this.name = name;
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(name, vehicle.name) && Objects.equals(licensePlateNumber, vehicle.licensePlateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, licensePlateNumber);
    }

    @Override
    public String toString() {
        return "Vehicle{" + "name='" + name + '\'' + ", licensePlateNumber='" + licensePlateNumber + '\'' + '}';
    }
}
