package Accounts;

import Addressess.Address;

import Addressess.HomeAdress;
import User.User;
import Exception.InvalidAuthenticationException;
import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> users = new TreeSet<>();

    public void addUsers()throws ClassCastException{
        Address address1 = new HomeAdress("Adana","Saricam","Mehmet Akif Ersoy","162. st no 32");
        User user1=new User("Bugra","Tabir","tabirbugra@gmail.com","1234","Software Developer",24,address1,"Individual");
        Account account1 = new Individual(user1);

        Address address2 = new HomeAdress("Kahramanmaras","Tabuşikino","Haydarbey","18/7");
        User user2 = new User("Sena","Demir","demirsena@gmail.com","1235","Psikolog",21,address2,"Individual");
        Account account2 = new Individual(user2);

        users.add(account1);
        users.add(account2);
    }

    public Account login(String email,String password){
        addUsers();
            try {
                for (Account acc : users){
                    if (acc.getUser().geteMail().equals(email) && acc.getUser().getPassword().equals(password)){
                        acc.login(email,password,acc);
                        return acc;
                    }
                }throw new InvalidAuthenticationException("Email or password wrong");
            }catch (InvalidAuthenticationException e){
                System.out.println(e.getMessage());
            }
            return null;
    }
}
