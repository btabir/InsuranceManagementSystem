package Insurances;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String insuranceType) {
        super("Health Insurance",new Date(),new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price = 1499.99;
        if (insuranceType.equals("Individual")){
            setPrice(price);
        }

        if (insuranceType.equals("Enterprise")){
            setPrice(0.9*price);
        }
    }
}
