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
        //bank = Utils.createDummyData(bank);
        System.out.println("Bank name: " + bank.getName());
        while(!option.equals("6")){
            option = Utils.getOptionsAdminMenu(bank.getName());
            switch (option){
                case "1":
                    user = Utils.createUserView();
                    bank.addUser(user);
                    break;
                case "2":
                    try{
                        users = bank.getUsers();
                        if(users.size() > 0){
                            SavingAccount savingAccount = Utils.createAccountView();
                            bank.addSavingAccount(savingAccount);
                            user = Utils.addOwnerToAccountView(users);
                            savingAccount.setOwner(user);
                        }else {
                            System.out.println("There isn't users yet, please add an user first");
                        }
                    }catch (Exception e){
                        System.out.println("There was an error creating the Account :(");
                    }
                    break;
                case "3":
                    Utils.listUsersView(bank);
                    break;
                case "4":
                    Utils.listBankAccountsView(bank);
                    break;
                case "5":
                    if(bank.getAccounts().size() > 1){
                        Utils.performTransferView(bank);
                    }else {
                        System.out.println("There is not enough accounts to perform a transfer");
                    }
                    break;
            }
        }

    }
}
