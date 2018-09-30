package Animals;

import org.junit.Assert;
import org.junit.Test;
import sample.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ReservorTest
{
    @Test
    public void TestConstructor()
    {
        LocalDate today = LocalDate.now();

        Reservor reservor = new Reservor("John Doe", today);
        Assert.assertEquals("John Doe", reservor.Name);
        Assert.assertEquals(today, reservor.ReservedAt);
    }

}
