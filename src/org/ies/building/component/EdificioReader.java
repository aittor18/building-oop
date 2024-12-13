package org.ies.building.component;

import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

import java.util.Scanner;

public class EdificioReader {
    private final Scanner scanner;
    private final ApartmentReader apartmentReader;

    public EdificioReader(ApartmentReader apartmentReader, Scanner scanner) {
        this.apartmentReader = apartmentReader;
        this.scanner = scanner;
    }

    public Building read() {
        System.out.println("Introduce los datos del edificio");
        System.out.print("Dirección: ");
        String address = scanner.nextLine();

        System.out.print("Municipio: ");
        String municipality = scanner.nextLine();

        System.out.print("Introduce la cantidad de apartamentos: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Apartment[] apartment = new Apartment[size];
        for (int i = 0; i < size; i++) {
            apartment[i] = apartmentReader.read();
        }

        return new Building(
                address,
                municipality,
                apartment
        );
    }
}
