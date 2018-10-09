package SOLID.S;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArmorTest
{
    User user;
    Armor armor;


    @Before
    public void TestInitialize()
    {
        user = new User(500, "Bob");
        armor = new Armor(50, 3, 250);
    }

    @Test
    public void TestSellArmor()
    {
        WeaponShop shop = new WeaponShop();
        shop.SellArmor(armor);
        Assert.assertEquals(shop.getArmorInventory().size(), 1);
        Assert.assertTrue(shop.getArmorInventory().contains(armor));
    }

    @Test
    public void TestBuyArmor()
    {
        WeaponShop shop = new WeaponShop();

        Armor tier5 = new Armor(20, 5, 150);
        Armor tier2 = new Armor(50, 2, 200);

        shop.SellArmor(tier2);
        shop.SellArmor(tier5);
        shop.BuyArmor(tier5, user);
        Assert.assertEquals(350, user.get_gold());
    }
}
