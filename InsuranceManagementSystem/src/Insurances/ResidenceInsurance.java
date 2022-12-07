package Insurances;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceType) {
        super("Residence Insurance",new Date(),new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price = 1299.99;
        if (insuranceType.equals("Individual")){
            setPrice(price);
        }

        if (insuranceType.equals("Enterprise")){
            setPrice(0.9*price);
        }
    }
}
