package belajarUTS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AtmMachine {
    private String kodeAtm;
    private double cash;
    private ActiveEnum activeEnum;
    private AtmCard atmCard;
    private ArrayList<Transaction> transaksi = new ArrayList<Transaction>();

    public AtmMachine(String kodeAtm, double cash, ActiveEnum activeEnum, AtmCard atmCard, ArrayList<Transaction> transaksi) {
        this.kodeAtm = kodeAtm;
        this.cash = cash;
        this.activeEnum = activeEnum;
        this.atmCard = atmCard;
        this.transaksi = transaksi;
    }

    public String getKodeAtm() {
        return kodeAtm;
    }

    public void setKodeAtm(String kodeAtm) {
        this.kodeAtm = kodeAtm;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ActiveEnum getActiveEnum() {
        return activeEnum;
    }

    public void setActiveEnum(ActiveEnum activeEnum) {
        this.activeEnum = activeEnum;
    }

    public AtmCard getAtmCard() {
        return atmCard;
    }

    public void setAtmCard(AtmCard atmCard) {
        this.atmCard = atmCard;
    }

    public ArrayList<Transaction> getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(ArrayList<Transaction> transaksi) {
        this.transaksi = transaksi;
    }

    public void insertCard() {
        boolean insert = false;
        ArrayList<Account> listAcc = new ArrayList<Account>();
        ArrayList<AtmCard> listAtmCard = new ArrayList<AtmCard>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        Main.dataDummy(listAcc, listAtmCard, transactions);

        for (int i = 0; i < listAtmCard.size(); i++) {
            if (!listAtmCard.get(i).getCardNumber().isEmpty()) {
                insert = true;
                JOptionPane.showMessageDialog(null, insert);
            } else {
                JOptionPane.showMessageDialog(null, insert);
            }
        }
    }

    public void validatePin(String pin) {
        boolean validatePin = false;
        ArrayList<Account> listAcc = new ArrayList<Account>();
        ArrayList<AtmCard> listAtmCard = new ArrayList<AtmCard>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        Main.dataDummy(listAcc, listAtmCard, transactions);

        for (int i = 0; i < listAtmCard.size(); i++) {
            if (listAtmCard.get(i).getPin() == pin) {
                validatePin = true;
                JOptionPane.showMessageDialog(null, validatePin);
            } else {
                if (listAtmCard.get(i).getPin() != pin)
                JOptionPane.showMessageDialog(null, validatePin);
            }
        }
    }

    public void cekSaldo(String pin) {
        ArrayList<Account> listAcc = new ArrayList<Account>();
        ArrayList<AtmCard> listAtmCard = new ArrayList<AtmCard>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        Main.dataDummy(listAcc, listAtmCard, transactions);

        for (int i = 0; i < listAtmCard.size(); i++) {
            if (listAtmCard.get(i).getPin() == pin) {
                JOptionPane.showMessageDialog(null, "saldo kamu : " + listAcc.get(i).getBalance());
            }

        }
    }

    public void withdrawal(double amount) {
        ArrayList<Account> listAcc = new ArrayList<Account>();
        ArrayList<AtmCard> listAtmCard = new ArrayList<AtmCard>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        Main.dataDummy(listAcc, listAtmCard, transactions);

        for (int i = 0; i < listAtmCard.size(); i++) {
            if (activeEnum == ActiveEnum.ACTIVE) {
                if (atmCard != null) {
                    String enteredPIN = "222222"; // PIN dari data dummy
                    if (atmCard.getPin() == enteredPIN) {
                        for (int j = 0; j < transaksi.size(); j++) {
                            Transaction trans = transaksi.get(j);
                            if (trans instanceof WithdrawalTransaction) {
                                WithdrawalTransaction narikUang = (WithdrawalTransaction) trans;
                                if (narikUang.getAmount() == amount) {
                                    double hasil = listAcc.get(i).getBalance() - amount;
                                    JOptionPane.showMessageDialog(null, "sisa saldo kamu seteleh narik : " + hasil);
                                } else {
                                    JOptionPane.showMessageDialog(null, "GAGAL NJG");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void transfer(String destinasi) {
        ArrayList<Account> listAcc = new ArrayList<Account>();
        ArrayList<AtmCard> listAtmCard = new ArrayList<AtmCard>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        Main.dataDummy(listAcc, listAtmCard, transactions);

        for (int i = 0; i < listAtmCard.size(); i++) {
            if (activeEnum == ActiveEnum.ACTIVE) {
                if (atmCard != null) {
                    String enteredPIN = "222222"; // PIN dari data dummy
                    if (atmCard.getPin() == enteredPIN) {
                        for (int j = 0; j < transaksi.size(); j++) {
                             Transaction ngirimUang = transaksi.get(j);
                            if (ngirimUang instanceof TransferTransaction) {
                                TransferTransaction transferTransaction = (TransferTransaction) ngirimUang;
                                if (transferTransaction.getDestinationNumber().equals(destinasi)) {
                                    double hasil = listAcc.get(i).getBalance() - transferTransaction.getAmount();
                                    JOptionPane.showMessageDialog(null, "sisa saldo kamu seteleh transfer ke " + destinasi + " adalah : " + hasil);
                                } else {
                                    JOptionPane.showMessageDialog(null, "GAGAL NJG");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
