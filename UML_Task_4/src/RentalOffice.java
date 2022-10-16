import Contracts.Contract;
import Vehicles.MotorVehicle;

import java.util.ArrayList;
import java.util.LinkedList;

public class RentalOffice {

    public RentalOffice(ArrayList vehicles) {
        this.vehicles = vehicles;
    }

    public boolean checkVehicleAvailability() {
        return true;
    }

    public void createReservation() {

    }
    public void cancelReservation() {

    }

    public void signRentalContract() {

    }

    public  void signAssociationInsurance() {

    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }
    public void addClient(Client client) {
        this.clients.add(client);
    }
    private ArrayList<MotorVehicle> vehicles;
    private LinkedList<Contract> contracts;

    private LinkedList<Client> clients;

}
