package Users;

import Contracts.Contract;
import Contracts.InsuranceContract;
import Contracts.RentalContract;
import Contracts.ReservationContract;
import Licenses.License;
import Vehicles.MotorVehicle;

import java.util.ArrayList;
import java.util.LinkedList;

public class RentalOffice {

    public RentalOffice(ArrayList vehicles) {
        this.vehicles = vehicles;
    }

    public boolean checkVehicleAvailability(License license) {

        for (int i = 0; i < vehicles.size(); i ++) {
            if (vehicles.get(i).getCategory() == license.getCategory()) {
                return true;
            }
        }
        return  false;
    }

    public ReservationContract createReservation() {
        ReservationContract contract = new ReservationContract();
        return contract;
    }
    public void cancelReservation() {

    }

    public RentalContract signRentalContract(Client client) {

        RentalContract contract = new RentalContract();
        contract.setClient(client);
        return contract;
    }

    public  RentalContract signAssociationInsurance(Client client) {
        RentalContract contract = new RentalContract();
        InsuranceContract insuranceContract = new InsuranceContract(contract);
        insuranceContract.setClient(client);
        contract.setClient(client);
        return contract;
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
