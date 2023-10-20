package latihanUTS22;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void dataDummy(ArrayList<Player> listPlayer, ArrayList<Item> listItem) {
        ArrayList<AmountItem> banyakItem1 = new ArrayList<AmountItem>();
        ArrayList<AmountItem> banyakItem2 = new ArrayList<AmountItem>();

        // ini dummy item
        Item itemE1 = new ItemEquipment("pedang", TypeItem.EQUIPMENT, 1, TypeEquipment.ARMOR); // manggil anak dari item
                                                                                               // agar bisa di buat
                                                                                               // objek
        Item ramuan1 = new ItemPotion("penghilang ngantuk", TypeItem.POTION, 5, TypePotion.HP);
        listItem.add(itemE1);
        listItem.add(ramuan1);

        Item itemE2 = new ItemEquipment("baju zirah", TypeItem.EQUIPMENT, 1, TypeEquipment.ARMOR); // manggil anak dari
                                                                                                   // item agar bisa di
                                                                                                   // buat objek
        Item ramuan2 = new ItemPotion("wasabi", TypeItem.POTION, 5, TypePotion.HP);
        listItem.add(itemE2);
        listItem.add(ramuan2);

        // ini dummy inventory
        Inventory inventoryB1 = new Inventory(20, banyakItem1);
        Inventory inventoryB2 = new Inventory(0, banyakItem2);

        // dummy amountItem
        AmountItem amountItem1 = new AmountItem(10, ramuan1, inventoryB1); // ini isi dari inventory 1
        AmountItem amountItem2 = new AmountItem(10, itemE1, inventoryB1);
        banyakItem1.add(amountItem1);
        banyakItem1.add(amountItem2);

        AmountItem amountItem3 = new AmountItem(20, ramuan2, inventoryB2); // ini isi inventory 2
        banyakItem2.add(amountItem3);

        // dummy player
        Player dea = new Player(5, 10, 8, 10, 50, inventoryB1);
        listPlayer.add(dea);

        Player grace = new Player(10, 20, 12, 10, 50, inventoryB2);
        listPlayer.add(grace);
    }

    public static void printStatusPlayer() {
        ArrayList<Player> listPlayer = new ArrayList<Player>();
        ArrayList<Item> listItem = new ArrayList<Item>();
        dataDummy(listPlayer, listItem);

        for (int i = 0; i < listPlayer.size(); i++) {
            JOptionPane.showMessageDialog(null, "Status player dea : "
                    + "\n dea's current energy : " + listPlayer.get(0).currentEnergy
                    + "\n dea's current health : " + listPlayer.get(0).currentHealth
                    + "\n dea's damage : " + listPlayer.get(0).damage
                    + "\n dea's max energy : " + listPlayer.get(0).maxEnergy
                    + "\n dea's max health : " + listPlayer.get(0).maxHealth
                    + "\n\n" + "Status player grace : "
                    + "\n grace's current energy : " + listPlayer.get(1).currentEnergy
                    + "\n grace's current health : " + listPlayer.get(1).currentHealth
                    + "\n grace's damage : " + listPlayer.get(1).damage
                    + "\n grace's max energy : " + listPlayer.get(1).maxEnergy
                    + "\n grace's max health : " + listPlayer.get(1).maxHealth, "info player bang",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> listPlayer = new ArrayList<Player>();
        ArrayList<Item> listItem = new ArrayList<Item>();
        Main.dataDummy(listPlayer, listItem);

        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose Menu : \n 1. Show player's status"
                + "\n" + " 2. Open inventory"
                + "\n" + " 3. Farming"
                + "\n" + " 4. Add new item"
                + "\n" + " 5. Used item"
                + "\n" + " 6. Exit"));

        while (input != 0) {
            if (input == 1) {
                printStatusPlayer();
            } else if (input == 2) {
                Inventory.openInventory();
            } else if (input == 3) {
                Player dea = listPlayer.get(0);
                dea.farming();
            } else if (input == 4) {
                Player grace = listPlayer.get(1);
                String inputItem = "wasabi";
                String result = grace.usedItem(inputItem);
                JOptionPane.showMessageDialog(null, result);
                break;
            }
        }
    }
}
