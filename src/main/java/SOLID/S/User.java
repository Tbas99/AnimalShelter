package SOLID.S;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int _gold;

    private String _name;

    private List<Armor> armorInventory;

    public User(int gold, String name) {
        _gold = gold;
        _name = name;

        armorInventory = new ArrayList<>();
    }

    public void storeArmor(Armor armor) {
        armorInventory.add(armor);
    }

    public void set_gold(int _gold) {
        this._gold = _gold;
    }

    public int get_gold() {
        return _gold;
    }
}
