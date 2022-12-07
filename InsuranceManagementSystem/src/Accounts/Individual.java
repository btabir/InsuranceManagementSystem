package Accounts;

import Insurances.*;
import User.User;


public class Individual extends Account{

    private final String individual = "Individual";
    public Individual(User user) {
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
                getUser().setInsurances(new CarInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurances());
                System.out.println("You have a car insurance anymore.");
                break;

            case 2:
                System.out.println("You have choosed the health insurance");
                getUser().setInsurances(new HealthInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurances());
                System.out.println("You have a health insurance anymore.");
                break;

            case 3:
                System.out.println("You have choosed the residence insurance");
                getUser().setInsurances(new ResidenceInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurances());
                System.out.println("You have a residence insurance anymore.");
                break;

            case 4:
                System.out.println("You have choosed the travel insurance");
                getUser().setInsurances(new TravelInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurances());
                System.out.println("You have a travel insurance anymore.");
                break;
        }
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getName().compareTo(o.getUser().getName());
    }
}
