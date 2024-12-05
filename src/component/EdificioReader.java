package component;

import model.Build;

import java.util.Scanner;

public class EdificioReader {
    private final Scanner scanner;

    public EdificioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Build read() {
        System.out.print("Introduce la dirección del edificio: ");
        String address = scanner.nextLine();
        System.out.print("Introduce el municipio: ");
        String municipality = scanner.nextLine();
        System.out.print("Introduce el número de apartamentos del edificio: ");
        int apartments = scanner.nextInt();
        scanner.nextLine();
    }
}
