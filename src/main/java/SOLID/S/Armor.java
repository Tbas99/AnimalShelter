package SOLID.S;

public class Armor
{
    private int _points;

    private int _tier;

    private int _price;

    public Armor(int points, int tier, int price) {
        _points = points;
        _tier = tier;
        _price = price;
    }

    public int get_price() {
        return _price;
    }
}
