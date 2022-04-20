package Runner;

import Data.Bank;
import Data.User;
import Helper.Utils;

public class Runner {
    public static void main(String[] args) {
        String option;
        Bank bank;
        bank = Utils.createBankView();
        System.out.println("Bank name: " + bank.getName());
        option = Utils.getOptionsAdminMenu();
        switch (option){
            case "1":
                User user = Utils.createUserView();
                bank.addUser(user);
                break;
        }
    }
}
