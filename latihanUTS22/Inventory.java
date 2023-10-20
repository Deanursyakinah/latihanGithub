package latihanUTS22;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Inventory {
    public int maxStorage;
    public ArrayList<AmountItem> amountItem = new ArrayList<AmountItem>();

    public Inventory(int maxStorage, ArrayList<AmountItem> amountItem) {
        this.maxStorage = maxStorage;
        this.amountItem = amountItem;
    }

    public static void openInventory() {
        ArrayList<Player> listPlayer = new ArrayList<Player>();
        ArrayList<Item> listItem = new ArrayList<Item>();
        Main.dataDummy(listPlayer, listItem);

        for (int i = 0; i < listPlayer.size(); i++) {
            Player pemain = listPlayer.get(i);
            StringBuilder inventoryInfo = new StringBuilder();
            for (int j = 0; j < pemain.inventory.amountItem.size(); j++) {
                if (listPlayer.get(0).inventory.amountItem == null) {
                    JOptionPane.showMessageDialog(null, "Inventory : " + "kosong bang", "info inventory bang",JOptionPane.INFORMATION_MESSAGE);  
                } else {
                    AmountItem amountItem = pemain.inventory.amountItem.get(j);
                    inventoryInfo.append("\n" + amountItem.item.name + " (" + amountItem.amount + ")");
                    JOptionPane.showMessageDialog(null, "Inventory : " + inventoryInfo.toString(), "info inventory bang", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
    }

    public void addNewItem(Item newItem) {
        // Iterasi melalui semua amountItem dalam inventory
        for (int i = 0; i < amountItem.size(); i++) {
            AmountItem existingItem = amountItem.get(i);
            // Jika item sudah ada dalam inventory, tambahkan jumlahnya
            if (existingItem.item.equals(newItem)) {
                existingItem.amount++;
                return;
            }
        }

        // Jika item belum ada dalam inventory, buat AmountItem baru
        AmountItem newAmountItem = new AmountItem(1, newItem, new Inventory(maxStorage, amountItem));
        amountItem.add(newAmountItem);
    }

    // public void removeItem(String itemName) {
    //     ArrayList<Player> listPlayer = new ArrayList<Player>();
    //     ArrayList<Item> listItem = new ArrayList<Item>();
    //     Main.dataDummy(listPlayer, listItem);

    //     for (int i = 0; i < listPlayer.size(); i++) {
    //         Player pemain = listPlayer.get(i);
    //         for (int j = 0; j < pemain.inventory.amountItem.size(); j++) {
    //             Item item = listItem.get(j);
    //             if (item instanceof ItemEquipment && item instanceof ItemPotion) {
    //                 if (item.amountItem.get(j).amount > 1) {
    //                     item.amountItem.get(j).amount = -1;
    //                 } else {
    //                     this.amountItem.remove(amountItem);
    //                 }
    //                 break;
    //             }
    //         }
    //     }
    // }

    public void removeItem(String itemName) {
        int i = 0;
        while (i < this.amountItem.size()) {
            AmountItem amountItem = this.amountItem.get(i);
            if (amountItem.item.name.equals(itemName)) {
                if (amountItem.amount > 1) {
                    amountItem.amount = -1;
                } else {
                    this.amountItem.remove(i);
                }
            } else {
                i++;
            }
        }
    }
    
}
