package org.ies.building.component;

import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingApp1 {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingApp1(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {
        int option;
        Building building = buildingReader.read();
        do {
            System.out.println("1. Mostrar la información del edificio");
            System.out.println("2. Mostrar apartamento");
            System.out.println("3. Mostrar apartamentos de una planta");
            System.out.println("4. Mostrar propietarios de escalera");
            System.out.println("5. Mostrar datos de apartamento");
            System.out.println("6. Mostrar propietarios de un apartamento");
            System.out.println("7. Salir del menú");
            System.out.print("Escoge la opción deseada: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    building.showInfo();
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (option != 7);
    }
}
