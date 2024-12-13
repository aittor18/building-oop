package org.ies.building.component;

import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

import java.util.Scanner;

public class EdificioReader {
    private final Scanner scanner;

    public EdificioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Building read() {
        System.out.print("Introduce la dirección del edificio: ");
        String address = scanner.nextLine();
        System.out.print("Introduce el municipio: ");
        String municipality = scanner.nextLine();
        System.out.print("Introduce el número de apartamentos del edificio: ");
        Apartment[] apartment = scanner.nextInt();
        scanner.nextLine();

        return new Building(
                address,
                municipality,
                size
        );
    }
}
