package Insurances;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String insuranceType) {
        super("Car Insurance",new Date(),new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price = 799.99;
        if (insuranceType.equals("Individual")){
            setPrice(price);
        }
        if (insuranceType.equals("Enterprise")){
            setPrice(0.9*price);
        }
    }
}
