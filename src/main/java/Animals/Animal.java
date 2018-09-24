package Animals;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Animal
{
    public String Name;
    public Gender Gender;
    public Reservor ReservedBy;

    public Animal(String name, Gender gender)
    {
        this.Name = name;
        this.Gender = gender;
    }

    public Boolean Reserve(String reservedBy)
    {
        if (this.ReservedBy == null)
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.now();
            Date today = new Date (dtf.format(localDate));
            this.ReservedBy = new Reservor(reservedBy, today);

            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        String reserved = "not reserved";
        if (this.ReservedBy != null)
        {
            reserved = "reserved by " + this.ReservedBy.Name;
        }
        return "Animal{" + "Name='" + this.Name + '\'' + ", Gender=" + this.Gender + reserved + '}';
    }
}
