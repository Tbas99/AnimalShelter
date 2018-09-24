package Animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest
{
    private Cat cat;

    @Before
    public void TestInitialize()
    {
        cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");
    }

    @Test
    public void TestConstructor()
    {
        Assert.assertEquals("Ms. Meow", cat.Name);
        Assert.assertEquals(Gender.Female, cat.Gender);
        Assert.assertNull(cat.ReservedBy);
        Assert.assertEquals("Scratches couch", cat.BadHabits);
    }

    @Test
    public void TestReservation()
    {
        Assert.assertNull(cat.ReservedBy);
        Assert.assertTrue(cat.Reserve("John Doe"));
        Assert.assertNotNull(cat.ReservedBy);
        Assert.assertEquals("John Doe", cat.ReservedBy.Name);
        Assert.assertFalse(cat.Reserve("Jane Doe"));
    }
}
