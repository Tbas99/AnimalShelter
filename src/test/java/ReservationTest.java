import Animals.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Reservation;

public class ReservationTest
{
    private Reservation reservation;

    @Before
    public void TestInitialize()
    {
        reservation = new Reservation();
    }

    @Test
    public void TestNewCat()
    {
        Assert.assertEquals(0, reservation.Animals.size());
        reservation.NewCat("Ms. Meow", Gender.Female, "Scratches couch");
        Assert.assertEquals(1, reservation.Animals.size());
    }

    @Test
    public void TestNewDog()
    {
        Assert.assertEquals(0, reservation.Animals.size());
        reservation.NewDog("Sgt. Woof", Gender.Male);
        Assert.assertEquals(1, reservation.Animals.size());
    }
}
