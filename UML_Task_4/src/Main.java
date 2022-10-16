import Contracts.RentalContract;
import Contracts.ReservationContract;
import Licenses.CarLicense;
import Licenses.License;
import Users.Client;
import Users.RentalOffice;
import Vehicles.Car;
import Vehicles.MotorVehicle;
import Vehicles.Truck;
import Vehicles.Van;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start");
        License carLicense = new CarLicense();
        Client client = new Client("Bob Test", UUID.randomUUID().toString(), carLicense);
        MotorVehicle car = new Car();
        MotorVehicle truck = new Truck();
        MotorVehicle van = new Van();
        ArrayList<MotorVehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(van);
        vehicles.add(truck);
        RentalOffice rentalOffice = new RentalOffice(vehicles);
        boolean available = rentalOffice.checkVehicleAvailability(client.getLicenses().stream().findFirst().get());
        if ( available ) {
            ReservationContract contract = rentalOffice.createReservation();
            client.addContract(contract);
            RentalContract rentalContract = rentalOffice.signRentalContract(client);
            client.addContract(rentalContract);
        }
    }
}