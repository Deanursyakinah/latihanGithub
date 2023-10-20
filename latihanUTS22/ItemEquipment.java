package latihanUTS22;

public class ItemEquipment extends Item {
    public int incrementAmount;
    public TypeEquipment typeEquipment;

    public ItemEquipment(String name, TypeItem typeItem, int incrementAmount, TypeEquipment typeEquipment) {
        super(name, typeItem);
        this.incrementAmount = incrementAmount;
        this.typeEquipment = typeEquipment;
    }
}
