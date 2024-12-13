package org.ies.building.component;

import org.ies.building.model.Owners;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Owners read() {
        System.out.println("Introduce todos los datos del propietario");
        System.out.print("NIF: ");
        String nif = scanner.nextLine();

        System.out.println("Nombre: ");
        String name = scanner.nextLine();

        System.out.println("Apellidos (Ambos): ");
        String surname = scanner.nextLine();

        return new Owners(
                nif,
                name,
                surname
        );
    }
}
