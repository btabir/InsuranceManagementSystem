package Addressess;

import User.User;
import java.util.Scanner;

public class AddressManager {

    private static Scanner input = new Scanner(System.in);

    public static void addAddress(User user){
        Address newAddress;
        System.out.println("Please select type of adress that you want to add");
        System.out.println("1 - Home Address         -          2 - Business Address");
        int select = input.nextInt();
        input.nextLine();
        System.out.print("Please enter your city : ");
        String newCity = input.nextLine();
        System.out.print("Please enter your district : ");
        String newDistrict = input.nextLine();
        System.out.print("Please enter you street : ");
        String newStreet = input.nextLine();
        System.out.print("Please enter the remain address details : ");
        String newDetailAddress = input.nextLine();
        if (select == 1){
            newAddress = new HomeAdress(newCity,newDistrict,newStreet,newDetailAddress);
        }else {
            newAddress = new BusinessAddress(newCity,newDistrict,newStreet,newDetailAddress);
        }
        user.setAdressList(newAddress);
    }

    public static void deleteAddress(User user,int id){
        user.getAdressList().remove(-1);
        System.out.println("You address has been succesfully removed.");
    }
}
