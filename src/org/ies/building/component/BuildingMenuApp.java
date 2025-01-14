package org.ies.building.component;

import java.util.Scanner;

public class BuildingMenuApp {
    // Dependencias
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    // Constructor
    public BuildingMenuApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    // Método
    public void run() {
        var building = buildingReader.read();
        int option;
        do {
            option = chooseOption();

            switch (option) {
                case 1:
                    building.showInfo();
                    break;

                case 2:
                    System.out.print("Introduce un número de planta: ");
                    var floor = scanner.nextInt();
                    scanner.nextLine();

                    var apartments = building.showApartmentFloor(floor);
                    System.out.println(apartments);
                    break;

                case 3:

            }
        } while (option != 5);
    }

    private int chooseOption() {
        int option;
        System.out.println("---Menú Building---");
        System.out.println("1. Mostrar datos del edificio");
        System.out.println("2. Mostrar apartamentos de una planta");
        System.out.println("3. Mostrar propietarios de una puerta");
        System.out.println("4. Mostrar datos de un apartamento");
        System.out.println("5. Salir");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
