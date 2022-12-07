package Login;

import java.util.Scanner;
import Accounts.Account;
import Accounts.AccountManager;

public class LoginSystem {
    Scanner input = new Scanner(System.in);
    AccountManager accountManager = new AccountManager();

    public void login(){
        System.out.println("Welcome to the Insurance System");
        System.out.print("Please enter your email : ");
        String email = input.nextLine();
        System.out.print("Please enter your password : ");
        String password = input.nextLine();

        Account loginAccount = accountManager.login(email,password);
        if (loginAccount!=null){
            loginAccount.showUserInfo();
            run(loginAccount);
        }
        else System.out.println("Unvalid user");
    }

    private void run(Account account){
        while (true){

            System.out.println("1- Show user info\n" +
                    "2- Make a new policy for user \n" +
                    "3- Add a new address for user\n" +
                    "4- Delete users address\n" +
                    "0- Exit");
            System.out.print("Please select an option : ");
            int select=input.nextInt();
            switch (select) {
                case 1:
                    account.showUserInfo();
                    break;
                case 2:
                    account.addPolicy();
                    break;
                case 3:
                    account.addAddress();
                    break;
                case 4:
                    account.deleteAddress();
                    break;
                case 0:
                default:
                    System.exit(0);
            }
        }
    }
}
