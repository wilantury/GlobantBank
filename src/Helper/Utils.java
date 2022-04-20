package Helper;

import Data.Bank;
import Data.SavingAccount;
import Data.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static float getFloat(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    public static int getInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printArrayUsers(ArrayList<User> users){
        int count = 0;
        for(User user : users){
            System.out.println(""+ count +" - username: " + user.getUsername());
            count++;
        }
    }

    public static String getLoginOptionsMenu(){
        System.out.println("Hello, we hope you are doing well :)");
        System.out.println("[1] Log in");
        System.out.println("[2] Sign up");
        System.out.println("[3] Exit");
        System.out.print("Please type an option: ");
        return getString();
    }

    public static String getOptionsAdminMenu(String bankName){
        System.out.printf("Hello, welcome to %s :)\n",bankName);
        System.out.println("[1] Create User");
        System.out.println("[2] Create Account");
        System.out.println("[3] List Users");
        System.out.println("[4] List bank accounts");
        System.out.println("[5] Transfer");
        System.out.println("[6] Exit");
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
    public static SavingAccount createAccountView() {
        String accountNumber;
        float balance;
        System.out.print("Please enter the account number: ");
        accountNumber = getString();
        System.out.print("Please enter initial balance: ");
        balance = getFloat();
        return new SavingAccount(accountNumber,balance);
    }

    public static User addOwnerToAccountView(ArrayList<User> users) {
        int index;
        System.out.println("Please choice an User to add as owner of the account: ");
        printArrayUsers(users);
        System.out.print("Enter de index of user: ");
        index = getInteger();
        return users.get(index);
    }

    public static void listUsersView(Bank bank) {
        System.out.printf("Users of the bank %s\n",bank.getName());
        printArrayUsers(bank.getUsers());
        System.out.print("Enter any key to go to main menu");
        getString();
    }

    public static void listBankAccountsView(Bank bank) {
        System.out.printf("Accounts of the bank %s\n",bank.getName());
        printArrayAccounts(bank.getAccounts());
        System.out.print("Enter any key to go to main menu");
        getString();
    }

    private static void printArrayAccounts(ArrayList<SavingAccount> savingAccounts) {
        int count = 0;
        for(SavingAccount savingAccount : savingAccounts){
            System.out.printf("%d - Account #: %s\tBalance: %f\tOwner: %s\n",count,savingAccount.getAccountNumber(),
                    savingAccount.getBalance(), savingAccount.getOwner().getUsername());
            count++;
        }
    }
}
