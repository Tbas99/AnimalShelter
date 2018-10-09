package SOLID.O;

import java.util.ArrayList;
import java.util.List;

public class Zaal
{
    private List<Zaal> zalen = new ArrayList<>();

    public double BerekenOppervlakte() {
        if (this instanceof VierkanteZaal) {
            VierkanteZaal vierkanteZaal = (VierkanteZaal)this;
            return vierkanteZaal.get_lengte() * vierkanteZaal.get_lengte();
        }
        else if (this instanceof RechthoekigeZaal) {
            RechthoekigeZaal rechthoekigeZaal = (RechthoekigeZaal)this;
            return rechthoekigeZaal.get_lengte() * rechthoekigeZaal.get_breedte();
        }
        else if (this instanceof RondeZaal) {
            RondeZaal rondeZaal = (RondeZaal)this;
            return rondeZaal.get_radius() * rondeZaal.get_radius() * Math.PI;
        }

        return 0;
    }
}
