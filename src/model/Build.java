package model;

import java.util.Objects;

public class Build {
    private String address;
    private String municipality;
    private int
            apartments;

    public Build(String address, String municipality, int apartments) {
        this.address = address;
        this.municipality = municipality;
        this.apartments = apartments;
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

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Build build = (Build) o;
        return apartments == build.apartments && Objects.equals(address, build.address) && Objects.equals(municipality, build.municipality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, municipality, apartments);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "address='" + address + '\'' +
                ", municipality='" + municipality + '\'' +
                ", apartments=" + apartments +
                '}';
    }
}
