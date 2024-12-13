package org.ies.building.component;

import org.ies.building.model.Apartment;
import org.ies.building.model.Owners;

import java.util.Scanner;

public class ApartmentReader {

    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartment read() {
        System.out.println("Introduce los datos del apartamento");
        System.out.print("Planta: ");
        int floor = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Puerta: ");
        String door = scanner.nextLine();

        System.out.print("¿Cuántos propietarios hay: ?");
        int size = scanner.nextInt();
        scanner.nextLine();

}
