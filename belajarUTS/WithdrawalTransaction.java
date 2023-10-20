package belajarUTS;
import java.time.LocalDate;

public class WithdrawalTransaction extends Transaction{
    private double amount;

    public WithdrawalTransaction(String transactionID, LocalDate dateTime, double amount) {
        super(transactionID, dateTime);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
