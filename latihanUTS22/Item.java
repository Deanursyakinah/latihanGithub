package latihanUTS22;
import java.util.ArrayList;

public abstract class Item {
    public String name;
    public TypeItem typeItem;
    public ArrayList<AmountItem> amountItem = new ArrayList<AmountItem>();

    public Item(String name, TypeItem typeItem) {
        this.name = name;
        this.typeItem = typeItem;
    }
}