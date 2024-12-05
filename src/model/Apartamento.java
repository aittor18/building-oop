package model;

import java.util.Objects;

public class Apartamento {
    private int floor;
    private String door;
    private String owners;

    public Apartamento(int floor, String door, String owners) {
        this.floor = floor;
        this.door = door;
        this.owners = owners;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return floor == that.floor && Objects.equals(door, that.door) && Objects.equals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, door, owners);
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "floor=" + floor +
                ", door='" + door + '\'' +
                ", owners='" + owners + '\'' +
                '}';
    }
}
