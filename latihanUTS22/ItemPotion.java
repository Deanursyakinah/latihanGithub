package latihanUTS22;

public class ItemPotion extends Item{
    public int healAmount;
    public TypePotion typePotion;
    
    public ItemPotion(String name, TypeItem typeItem, int healAmount, TypePotion typePotion) {
        super(name, typeItem);
        this.healAmount = healAmount;
        this.typePotion = typePotion;
    }
}
