package Data;

public class SavingAccount extends Account{
    private float withdrawTaxFix = 200;
    private float withdrawTaxPercentage = 0.15f;
    private float transferTaxFix = 100;

    public SavingAccount(String name, float balance){
        super(name,balance);
    }

    public SavingAccount(String accountNumber, float balance, float withdrawTaxFix, float withdrawTaxPercentage, float transferTaxFix){
        super(accountNumber,balance);
        this.transferTaxFix = transferTaxFix;
        this.withdrawTaxFix = withdrawTaxFix;
        this.withdrawTaxPercentage = withdrawTaxPercentage;
    }

    private float calcTaxWithdraw(float amount){
        return 0;
    }

    private float calcTaxTransfer(float amount){
        return 0;
    }
}
