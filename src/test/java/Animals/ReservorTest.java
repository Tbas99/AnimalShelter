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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        Date today = new Date (dtf.format(localDate));

        Reservor reservor = new Reservor("John Doe", today);
        Assert.assertEquals("John Doe", reservor.Name);
        Assert.assertEquals(today, reservor.ReservedAt);
    }

}
