package Data;

public class SavingAccount extends Account{
    private float withdrawTaxFix = 200;
    private float withdrawTaxPercentage = 0.15f;
    private float transferTaxFix = 100;
    private User owner;

    public SavingAccount(String accountNumber, float balance){
        super(accountNumber,balance);
    }

    public SavingAccount(String accountNumber, float balance, float withdrawTaxFix, float withdrawTaxPercentage, float transferTaxFix){
        super(accountNumber,balance);
        this.transferTaxFix = transferTaxFix;
        this.withdrawTaxFix = withdrawTaxFix;
        this.withdrawTaxPercentage = withdrawTaxPercentage;
    }

    public boolean checkFundsTransfer(float amountToRetrieve){
        float totalTax = amountToRetrieve + this.transferTaxFix;
        return this.getBalance() >= totalTax ? true : false;
    }

    public void withdrawBalance(float amount){
        this.setBalance(this.getBalance() - amount -this.transferTaxFix);
    }

    private float calcTaxWithdraw(float amount){
        return 0;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return this.owner;
    }
}
