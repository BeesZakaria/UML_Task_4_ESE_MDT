package Contracts;

public class RentalContract extends Contract{
    private final String type = "Rental";
    public RentalContract(InsuranceContract insuranceContract) {
        this.insuranceContract = insuranceContract;
    }
    public RentalContract() {
    }

    public InsuranceContract getInsuranceContract() {
        return insuranceContract;
    }

    public void setInsuranceContract(InsuranceContract insuranceContract) {
        this.insuranceContract = insuranceContract;
    }

    private InsuranceContract insuranceContract;
}
