package Animals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dog extends Animal
{
    public Date LastWalk;

    public boolean NeedsWalk()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        Date today = new Date (dtf.format(localDate));

        long diffInMillies = Math.abs(today.getTime() - LastWalk.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        if (diff > 0)
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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        Date today = new Date (dtf.format(localDate));
        this.LastWalk = today;
    }

    @Override
    public String toString()
    {
        return super.toString() + "LastWalk=" + LastWalk;
    }
}
