package latihanUTS22;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    public int currentHealth;
    public int maxHealth;
    public int currentEnergy;
    public int maxEnergy;
    public int damage;
    public Inventory inventory;

    public Player(int currentHealth, int maxHealth, int currentEnergy, int maxEnergy, int damage, Inventory inventory) {
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.currentEnergy = currentEnergy;
        this.maxEnergy = maxEnergy;
        this.damage = damage;
        this.inventory = inventory;
    }

    public void farming() {
        ArrayList<Player> listPlayer = new ArrayList<Player>();
        ArrayList<Item> listItem = new ArrayList<Item>();
        Main.dataDummy(listPlayer, listItem);

        Random random = new Random();
        int randomIndex = random.nextInt(listItem.size());
        Item randomItem = listItem.get(randomIndex);

        inventory.addNewItem(randomItem);
    }

    public String usedItem(String inputItem) {
        ArrayList<Player> listPlayer = new ArrayList<Player>();
        ArrayList<Item> listItem = new ArrayList<Item>();
        Main.dataDummy(listPlayer, listItem);
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < listPlayer.size(); i++) {
            Player pemain = listPlayer.get(i);
            for (int j = 0; j < listItem.size(); j++) {
                Item item = listItem.get(j);
                if (item.name.equals(inputItem)) {
                    if (item instanceof ItemEquipment) {
                        ItemEquipment ie = (ItemEquipment) item;
                        if (ie.typeEquipment == TypeEquipment.ARMOR) {
                            pemain.maxHealth = ie.incrementAmount;
                            hasil.append("Player's maxHealth bertambah sebanyak :  " + ie.incrementAmount + "\n");
                        } else if (ie.typeEquipment == TypeEquipment.MAGIC_THAT) {
                            pemain.maxEnergy = ie.incrementAmount;
                            hasil.append("Player's maxEnergy bertambah sebanyak :  " + ie.incrementAmount + "\n");
                        } else if (ie.typeEquipment == TypeEquipment.WEAPON) {
                            pemain.damage = ie.incrementAmount;
                            hasil.append("Player's damage bertambah sebanyak :  " + ie.incrementAmount + "\n");
                        }
                    } else if (item instanceof ItemPotion) {
                        ItemPotion ip = (ItemPotion) item;
                        if (ip.typePotion == TypePotion.HP) {
                            pemain.currentHealth = ip.healAmount;
                            hasil.append("Player's current health bertambah sebanyak :  " + ip.healAmount + "\n");
                        } else if (ip.typePotion == TypePotion.MP) {
                            pemain.currentEnergy = ip.healAmount;
                            hasil.append("Player's current eneergy bertambah sebanyak :  " + ip.healAmount + "\n");
                        }
                    }
                    pemain.inventory.removeItem(inputItem); // Panggil method removeItem pada inventory player
                break;
                }
            }
        }
        return hasil.toString();
    }
}

// kalau private
// public String usedItem(Player player, Item item) {
// String hasil = " ";

// if (item instanceof ItemEquipment) {
// ItemEquipment equipment = (ItemEquipment) item;
// if (equipment.getTypeEquipment() == TypeEquipment.ARMOR) {
// player.setMaxHealth(player.getMaxHealth() + 1);
// } else if (equipment.getTypeEquipment() == TypeEquipment.MAGIC_THAT) {
// player.setMaxEnergy(player.getMaxEnergy() + 1);
// } else if (equipment.getTypeEquipment() == TypeEquipment.WEAPON) {
// player.setDamage(player.getDamage() + 1);
// }
// } else if (item instanceof ItemPotion) {
// ItemPotion potion = (ItemPotion) item;
// if (potion.getTypePotion() == TypePotion.HP) {
// player.setCurrentHealth(player.getCurrentHealth() + 1);
// } else if (potion.getTypePotion() == TypePotion.MP) {
// // Lakukan apa pun yang perlu Anda lakukan ketika mengonsumsi Potion MP
// }
// }

// return hasil;
// }

// public String usedItem(String inputItem) {
// ArrayList<Player> listPlayer = new ArrayList<Player>();
// ArrayList<Item> listItem = new ArrayList<Item>();
// Main.dataDummy(listPlayer, listItem);
// StringBuilder hasil = new StringBuilder();

// for (int i = 0; i < listPlayer.size(); i++) {
// Player pemain = listPlayer.get(i);
// for (int j = 0; j < listItem.size(); j++) {
// Item item = listItem.get(j);
// if (item.getName().equals(inputItem)) {
// if (item instanceof ItemEquipment) {
// ItemEquipment ie = (ItemEquipment) item;
// if (ie.getTypeEquipment() == TypeEquipment.ARMOR) {
// pemain.setMaxHealth(pemain.getMaxHealth() + ie.getIncrementAmount());
// hasil.append("Player's maxHealth increased by " + ie.getIncrementAmount() +
// "\n");
// } else if (ie.getTypeEquipment() == TypeEquipment.MAGIC_HAT) {
// pemain.setMaxEnergy(pemain.getMaxEnergy() + ie.getIncrementAmount());
// hasil.append("Player's maxEnergy increased by " + ie.getIncrementAmount() +
// "\n");
// } else if (ie.getTypeEquipment() == TypeEquipment.WEAPON) {
// pemain.setDamage(pemain.getDamage() + ie.getIncrementAmount());
// hasil.append("Player's damage increased by " + ie.getIncrementAmount() +
// "\n");
// }
// } else if (item instanceof ItemPotion) {
// ItemPotion ip = (ItemPotion) item;
// if (ip.getTypePotion() == TypePotion.HP) {
// pemain.setCurrentHealth(pemain.getCurrentHealth() + ip.getHealAmount());
// hasil.append("Player's currentHealth increased by " + ip.getHealAmount() +
// "\n");
// } else if (ip.getTypePotion() == TypePotion.MP) {
// pemain.setCurrentEnergy(pemain.getCurrentEnergy() + ip.getHealAmount());
// hasil.append("Player's currentEnergy increased by " + ip.getHealAmount() +
// "\n");
// }
// }
// }
// }
// }

// return hasil.toString();
// }
