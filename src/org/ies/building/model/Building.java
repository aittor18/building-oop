package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String municipality;
    private Apartment[] apartments;

    public Building(String address, String municipality, Apartment[] apartments) {
        this.address = address;
        this.municipality = municipality;
        this.apartments = apartments;
    }

    public void showInfo() {
        System.out.println("Dirección: " + address);
        System.out.println("Municipio: " + municipality);

        for (Apartment apartment : apartments) {
            System.out.println("Planta: " + apartment.getFloor());
            System.out.println("Puerta: " + apartment.getDoor());
        }
    }

    // Dado una planta y una puerta, devuelve el apartamento en esa planta y puerta. Si no existe dicho apartamento devuelve null.
    public Apartment showApartment(int floor, String door) {
        for (Apartment apartment : apartments) {
            if (apartment.getFloor() == floor && apartment.getDoor().equals(door)) {
                return apartment;
            }
        }

        return null;
    }

    // Dado una planta, mostrar los apartamentos de esa planta
    public Apartment showApartmentFloor(int floor) {
        for (Apartment apartment : apartments) {
            if (apartment.getFloor() == floor) {
                return apartment;
            }
        }
        return null;
    }

    // Dado una planta y una puerta, devuelve los propietarios del apartamento de esa puerta y planta. Si no existe dicho apartamento devuelve
    // null.

    public Owners showOwners(int floor, String door) {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(municipality, building.municipality) && Objects.deepEquals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, municipality, Arrays.hashCode(apartments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", municipality='" + municipality + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
