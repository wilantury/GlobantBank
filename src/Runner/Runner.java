package Runner;

import Data.Bank;
import Data.SavingAccount;
import Data.User;
import Helper.Utils;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        String option="";
        ArrayList<User> users;
        User user;
        Bank bank;
        bank = Utils.createBankView();
        System.out.println("Bank name: " + bank.getName());
        while(!option.equals("6")){
            option = Utils.getOptionsAdminMenu(bank.getName());
            switch (option){
                case "1":
                    user = Utils.createUserView();
                    bank.addUser(user);
                    break;
                case "2":
                    SavingAccount savingAccount = Utils.createAccountView();
                    bank.addSavingAccount(savingAccount);
                    users = bank.getUsers();
                    user = Utils.addOwnerToAccountView(users);
                    savingAccount.setOwner(user);
                    break;
                case "3":
                    Utils.listUsersView(bank);
                    break;
                case "4":
                    Utils.listBankAccountsView(bank);
            }
        }

    }
}
