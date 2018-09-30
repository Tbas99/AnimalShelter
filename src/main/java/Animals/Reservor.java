package Animals;

import java.time.LocalDate;

public class Reservor
{
    public String Name;

    public LocalDate ReservedAt;

    public Reservor(String name, LocalDate reservedAt)
    {
        this.Name = name;
        this.ReservedAt = reservedAt;
    }
}
