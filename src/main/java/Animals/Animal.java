package Animals;

import java.time.LocalDate;

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
            LocalDate today = LocalDate.now();
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
        return "Name = '" + this.Name + '\'' + ", Gender = " + this.Gender + ", " + reserved + ", ";
    }
}
