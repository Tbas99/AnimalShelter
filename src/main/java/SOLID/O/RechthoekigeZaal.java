package SOLID.O;

import java.math.BigDecimal;

public class RechthoekigeZaal extends Zaal
{
    private double _lengte;

    private double _breedte;

    public RechthoekigeZaal(double lengte, double breedte) {
        _lengte = lengte;
        _breedte = breedte;
    }

    public double get_lengte() {
        return _lengte;
    }

    public double get_breedte() {
        return _breedte;
    }
}
