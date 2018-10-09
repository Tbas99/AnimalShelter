package SOLID.D;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TarievenTest
{
    Account account;
    Bankrekening bankrekening;

    @Before
    public void TestInitialize()
    {
        account = new Account(250.65);
        bankrekening = new Bankrekening();
    }

    @Test
    public void TestToegestaandeMethodes()
    {
        Assert.assertEquals(bankrekening.pinTransactie(50.5, account._saldo), 200.10, 0.10);
    }
}
