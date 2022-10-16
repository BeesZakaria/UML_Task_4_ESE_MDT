package Contracts;

public class InsuranceContract extends Contract{
    public static final String INSURANCE = "Insurance";
    private final String type = INSURANCE;
    public RentalContract getRentalContract() {
        return rentalContract;
    }

    public void setRentalContract(RentalContract rentalContract) {
        this.rentalContract = rentalContract;
    }

    public InsuranceContract(RentalContract rentalContract) {
        this.rentalContract = rentalContract;
    }

    private RentalContract rentalContract;
}
