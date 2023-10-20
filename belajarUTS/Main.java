package belajarUTS;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void dataDummy(ArrayList<Account> listAcc, ArrayList<AtmCard> listAtmCard,  ArrayList<Transaction> listTransactions) {
        TransferTransaction transferTransaction = new TransferTransaction("11", LocalDate.now(), "014", 500000.0);
        listTransactions.add(transferTransaction);

        WithdrawalTransaction withdrawalTransaction = new WithdrawalTransaction("12", LocalDate.now(), 1000000.0);
        listTransactions.add(withdrawalTransaction);

        AtmCard kartu1 = new AtmCard("4417003699999999", "222222");
        listAtmCard.add(kartu1);

        Account acc1 = new Account("12345", "dea", "korea", 2000000.0, kartu1);
        listAcc.add(acc1);
    }

    public static void main(String[] args) {
        int input = 0;
        ArrayList<Account> listAcc = new ArrayList<Account>();
        ArrayList<AtmCard> listAtmCard = new ArrayList<AtmCard>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        Main.dataDummy(listAcc, listAtmCard, transactions);
       
        AtmMachine atmMesin = new AtmMachine("1", 1000.0, ActiveEnum.ACTIVE, listAtmCard.get(0), transactions);

        do {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose Menu : \n 1. Insert card"
                    + "\n" + " 2. Validasi pin"
                    + "\n" + " 3. Cek saldo"
                    + "\n" + " 4. Tarik tunai"
                    + "\n" + " 5. Transfer"
                    + "\n" + " 6. Tolak kartu" 
                    + "\n" + " 7. Exit"));
            if (input == 1) {
                atmMesin.insertCard();
            } else if (input == 2) {
                String pin = "222222";
                atmMesin.validatePin(pin);
            } else if (input == 3) {
                String cardNumber = "222222";
                atmMesin.cekSaldo(cardNumber);
            } else if (input == 4) {
                double amount = 1000000.0;
                atmMesin.withdrawal(amount);
            } else if (input == 5) {
                // double amount = 500000.0;
                 String destinasi = "014";
                atmMesin.transfer(destinasi);
            } 
        } while (input != 7);
    }
}