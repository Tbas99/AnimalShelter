package Animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        LocalDate now = LocalDate.now();

        Assert.assertEquals("Sgt. Woof", dog.Name);
        Assert.assertEquals(Gender.Male, dog.Gender);
        Assert.assertNull(dog.ReservedBy);
        Assert.assertEquals(now, dog.LastWalk);
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
