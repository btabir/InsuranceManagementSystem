package Insurances;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceType) {
        super("Travel Insurance",new Date(), new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price = 899.99;
        if (insuranceType.equals("Individual")){
            setPrice(price);
        }
        if (insuranceType.equals("Enterprise")){
            setPrice(0.9*price);
        }
    }
}
