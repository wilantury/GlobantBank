package Helper;

import Data.Bank;
import Data.User;

import java.util.Locale;
import java.util.Scanner;

public class Utils {

    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }
    public static String getLoginOptionsMenu(){
        System.out.println("Hello, we hope you are doing well :)");
        System.out.println("[L]og in");
        System.out.println("[S]ign up");
        System.out.println("[E]xit");
        System.out.print("Please type an option: ");
        return getString();
    }

    public static String getOptionsAdminMenu(){
        System.out.println("Hello, we hope you are doing well :)");
        System.out.println("[1] Create User");
        System.out.println("[2] Create Account");
        System.out.println("[E]xit");
        System.out.print("Please type an option: ");
        return getString();
    }

    public static Bank createBankView() {
        String bankName;
        System.out.print("Please enter the name of the bank: ");
        bankName = getString();
        return new Bank(bankName);
    }

    public static User createUserView() {
        String username;
        String password;
        System.out.print("Please enter the username: ");
        username = getString();
        System.out.print("Please enter the password: ");
        password = getString();
        return new User(username,password);
    }
}
