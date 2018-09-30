package Animals;

public class Cat extends Animal
{
    public String BadHabits;

    public Cat(String name, Gender gender, String badHabits)
    {
        super(name, gender);
        this.BadHabits = badHabits;
    }

    @Override
    public String toString()
    {
        return "Cat, " + super.toString() + "BadHabits = '" + BadHabits + "'";
    }
}
