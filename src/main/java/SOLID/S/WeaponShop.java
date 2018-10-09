package SOLID.S;

import java.util.ArrayList;
import java.util.List;

public class WeaponShop
{
    private List<Armor> armorInventory;

    public WeaponShop() {
        armorInventory = new ArrayList<>();
    }


    public void SellWeapon(Weapon weapon) {

    }

    public int SellArmor(Armor armor) {
        armorInventory.add(armor);
        return armor.get_price();
    }

    public void BuyArmor(Armor armor, User user) {
        if (armorInventory.contains(armor)) {
            armorInventory.remove(armor);
            user.storeArmor(armor);
            int currentGold = user.get_gold();
            user.set_gold(currentGold - armor.get_price());
        }
    }

    public List<Armor> getArmorInventory() {
        return armorInventory;
    }
}
