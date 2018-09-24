package Animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest
{
    private Animal animal;

    @Before
    public void TestInitialize()
    {
        animal = new Animal("Ugly Duckling", Gender.Male);
    }

    @Test
    public void TestConstructor()
    {
        Assert.assertEquals("Ugly Duckling", animal.Name);
        Assert.assertEquals(Gender.Male, animal.Gender);
        Assert.assertNull(animal.ReservedBy);
    }

    @Test
    public void TestReservation()
    {
        Assert.assertNull(animal.ReservedBy);
        Assert.assertTrue(animal.Reserve("John Doe"));
        Assert.assertNotNull(animal.ReservedBy);
        Assert.assertEquals("John Doe", animal.ReservedBy.Name);
        Assert.assertFalse(animal.Reserve("Jane Doe"));
    }
}
