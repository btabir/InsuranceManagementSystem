package Accounts;

import Insurances.*;
import User.User;

public class Enterprise extends Account{

    private final String enterprise = "enterprise";
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addPolicy() {
            System.out.println("Insurance Types");
            System.out.println("-------------------");
            System.out.println("1 - Car Insurance \n" +
                    "2 - Health Insurance \n" +
                    "3 - Residence Insurance \n" +
                    "4 - Travel Insurance");
            System.out.println("-------------------");
            System.out.print("Please choose one of these insurances :");
            switch (input.nextInt()){
                case 1:
                    System.out.println("You have choosed the car insurance");
                    if (checkInsurance(new CarInsurance(enterprise))){
                        getUser().setInsurances(new CarInsurance(enterprise));
                        getUser().setInsuranceList(getUser().getInsurances());
                        System.out.println("You have a car insurance anymore.");
                    } else {
                        System.out.println("You already have this insurance");
                    }
                    break;
                case 2:
                    System.out.println("You have choosed the health insurance");
                    if (checkInsurance(new HealthInsurance(enterprise))){
                        getUser().setInsurances(new HealthInsurance(enterprise));
                        getUser().setInsuranceList(getUser().getInsurances());
                        System.out.println("You have a health insurance anymore.");
                    } else {
                        System.out.println("You already have this insurance");
                    }
                    break;

                case 3:
                    System.out.println("You have choosed the residence insurance");
                    if (checkInsurance(new ResidenceInsurance(enterprise))){
                        getUser().setInsurances(new ResidenceInsurance(enterprise));
                        getUser().setInsuranceList(getUser().getInsurances());
                        System.out.println("You have a residence insurance anymore.");
                    } else {
                        System.out.println("You already have this insurance");
                    }
                    break;
                case 4:
                    System.out.println("You have choosed the travel insurance");
                    if (checkInsurance(new TravelInsurance(enterprise))){
                        getUser().setInsurances(new TravelInsurance(enterprise));
                        getUser().setInsuranceList(getUser().getInsurances());
                        System.out.println("You have a travel insurance anymore.");
                    } else {
                        System.out.println("You already have this insurance");
                    }
                    break;
            }
        }

    public boolean checkInsurance(Insurance insurance){
        for (Insurance i: getUser().getInsuranceList()){
            if (i.getName().equals(insurance.getName())){
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }
}
