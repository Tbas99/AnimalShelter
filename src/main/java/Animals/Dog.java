package Animals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class Dog extends Animal
{
    public LocalDate LastWalk;

    public boolean NeedsWalk()
    {
        LocalDate today = LocalDate.now();

        long daysBetween = DAYS.between(today, LastWalk);

        if (daysBetween == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    };

    public Dog(String name, Gender gender)
    {
        super(name, gender);
        LocalDate today = LocalDate.now();
        this.LastWalk = today;
    }

    @Override
    public String toString()
    {
        return "Dog " + super.toString() + "LastWalk = " + LastWalk.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
