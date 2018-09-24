package Animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DogTest
{
    private Dog dog;

    @Before
    public void TestInitialize()
    {
        dog = new Dog("Sgt. Woof", Gender.Male);
    }

    @Test
    public void TestConstructor()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        Date today = new Date (dtf.format(localDate));

        Assert.assertEquals("Sgt. Woof", dog.Name);
        Assert.assertEquals(Gender.Male, dog.Gender);
        Assert.assertNull(dog.ReservedBy);
        Assert.assertEquals(today, dog.LastWalk);
        Assert.assertFalse(dog.NeedsWalk());
    }

    @Test
    public void TestReservation()
    {
        Assert.assertNull(dog.ReservedBy);
        Assert.assertTrue(dog.Reserve("John Doe"));
        Assert.assertNotNull(dog.ReservedBy);
        Assert.assertEquals("John Doe", dog.ReservedBy.Name);
        Assert.assertFalse(dog.Reserve("Jane Doe"));
    }
}
