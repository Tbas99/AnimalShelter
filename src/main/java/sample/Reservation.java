package sample;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.util.ArrayList;
import java.util.List;

public class Reservation
{
    public List<Animal> Animals = new ArrayList<Animal>();

    public void NewCat(String name, Gender gender, String badHabits)
    {
        Animals.add(new Cat(name, gender, badHabits));
    }

    public void NewDog(String name, Gender gender)
    {
        Animals.add(new Dog(name, gender));
    }

}
