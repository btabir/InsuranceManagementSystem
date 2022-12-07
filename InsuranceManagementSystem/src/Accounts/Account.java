package Accounts;

import Addressess.Address;
import Addressess.AddressManager;
import User.User;

import java.util.Scanner;

import Insurances.Insurance;

import java.util.ArrayList;

import Exception.InvalidAuthenticationException;

public abstract class Account implements Comparable<Account> {

    private User user;
    protected Scanner input = new Scanner(System.in);
    private ArrayList<Individual> IndividualList;
    private AuthenticationStatus status = AuthenticationStatus.FAIL;

    enum AuthenticationStatus {
        FAIL,
        SUCCESS
    }

    public Account(User user) {
        this.user = user;
    }

    public final void showUserInfo() {
        System.out.println("Users name : " + user.getName());
        System.out.println("Users surname : " + user.getSurname());
        System.out.println("Users email : " + user.geteMail());
        System.out.println("Users age : " + user.getAge());
        System.out.println("Users job : " + user.getJob());
        System.out.println("Users last entry : " + user.getLastEntry());
        System.out.println("Users membership type :" + user.getMembershipType());
        printAddresses();
        System.out.println();
        printInsurances();
        System.out.println();

    }

    public void login(String email, String password, Account account) throws InvalidAuthenticationException {
        if (account.getUser().geteMail().equals(email) && account.getUser().getPassword().equals(password)) {
            status = AuthenticationStatus.SUCCESS;
        } else throw new InvalidAuthenticationException("Login is unsuccessfull");
    }

    public void addAddress() {
        AddressManager.addAddress(this.user);
    }

    public void deleteAddress() {
        printAddresses();
        System.out.print("Please enter id of the address that you want to delete : ");
        int id = input.nextInt();
        AddressManager.deleteAddress(user, id);
    }

    public void printAddresses() {
        for (Address addr : user.getAdressList()) {
            addr.showAddressInfo();
        }
    }

    public void printInsurances() {
        for (Insurance insurance : user.getInsuranceList()) {
            System.out.println("Type of insurance : " + insurance.getName());
            System.out.println("Price of insurance : " + insurance.getPrice());
            System.out.println("Starting date of insurance : " + insurance.getStarting());
            System.out.println("Ending date of insurance : " + insurance.getEnding());
        }
    }

    public abstract void addPolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
