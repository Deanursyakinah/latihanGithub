package latihanUTS22;

public class AmountItem {
    public int amount;
    public Item item;
    public Inventory inventory;
    
    public AmountItem(int amount, Item item, Inventory inventory) {
        this.amount = amount;
        this.item = item;
        this.inventory = inventory;
    }
}
