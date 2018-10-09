package SOLID.O;

import java.math.BigDecimal;

public class RondeZaal extends Zaal
{
    private double _radius;

    public RondeZaal(double radius) {
        _radius = radius;
    }

    public double get_radius() {
        return _radius;
    }
}
