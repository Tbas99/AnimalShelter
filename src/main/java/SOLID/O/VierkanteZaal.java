package SOLID.O;

import java.math.BigDecimal;

public class VierkanteZaal extends Zaal
{
    private double _lengte;

    public VierkanteZaal(double lengte) {
        _lengte = lengte;
    }

    public double get_lengte() {
        return _lengte;
    }
}
