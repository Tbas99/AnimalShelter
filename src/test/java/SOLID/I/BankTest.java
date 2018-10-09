package SOLID.I;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest
{
    Bank bank;
    Bankrekening bankrekening;

    @Before
    public void TestInitialize()
    {
        bankrekening = new Bankrekening("Bob", "Eindhoven", "0056");
        bank = new Bank(bankrekening);
    }

    @Test
    public void TestToegestaandeMethodes()
    {
        bank.WijzigAdres("Maastricht");
        Assert.assertEquals("Maastricht", bankrekening._adres);
    }
}
