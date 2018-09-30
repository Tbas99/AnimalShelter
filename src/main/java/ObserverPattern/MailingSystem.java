package ObserverPattern;

import java.util.ArrayList;

public class MailingSystem implements Subject
{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private boolean IsAnimalReserved = false;

    public boolean isAnimalReserved()
    {
        return IsAnimalReserved;
    }

    public void setAnimalReserved(boolean reservationStatus)
    {
        IsAnimalReserved = reservationStatus;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer ob : observers) {
            ob.update();
        }
    }
}
