package belajarUTS;
import java.time.LocalDate;

public abstract class Transaction {
    private String transactionID;
    private LocalDate dateTime;

    public Transaction(String transactionID, LocalDate dateTime) {
        this.transactionID = transactionID;
        this.dateTime = dateTime;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
}
