import org.ies.building.component.ApartmentReader;
import org.ies.building.component.BuildingApp1;
import org.ies.building.component.BuildingReader;
import org.ies.building.component.OwnerReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartmentReader = new ApartmentReader(scanner, ownerReader);
        BuildingReader buildingReader = new BuildingReader(apartmentReader, scanner);

        var buildingApp1 = new BuildingApp1(scanner, buildingReader);

        var building = buildingReader.read();

        System.out.println(building);
    }
}