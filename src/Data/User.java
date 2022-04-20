package Data;

public class User {
    private SavingAccount savingAccount;
    private String username;
    private String password;


    //Getters
    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    //Setters
    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
