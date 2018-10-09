package SOLID.O;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZalenTest
{

    CongresCentrum congresCentrum;
    Zaal zaal;

    @Before
    public void TestInitialize()
    {
        congresCentrum = new CongresCentrum();
    }

    @Test
    public void TestRechthoekigeZaal()
    {
        congresCentrum.voegZaalToe(new RechthoekigeZaal(5, 6));
        Assert.assertEquals(30, congresCentrum.BerekenTotaleOppervlakte(), 0);
    }

    @Test
    public void TestVierkanteZaal()
    {
        congresCentrum.voegZaalToe(new VierkanteZaal(10));
        Assert.assertEquals(100, congresCentrum.BerekenTotaleOppervlakte(), 0);
    }
}
