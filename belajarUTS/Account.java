package belajarUTS;

public class Account {
    private String account;
    private String name;
    private String address;
    private double Balance;
    AtmCard atmCard;

    public Account(String account, String name, String address, double balance, AtmCard atmCard) {
        this.account = account;
        this.name = name;
        this.address = address;
        Balance = balance;
        this.atmCard = atmCard;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public AtmCard getAtmCard() {
        return atmCard;
    }

    public void setAtmCard(AtmCard atmCard) {
        this.atmCard = atmCard;
    }
}