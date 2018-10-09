package SOLID.O;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CongresCentrum {

    public double Tarief;

    public List<Zaal> zalen = new ArrayList<>();

    public double BerekenTotaleOppervlakte() {
        double oppervlakte = 0;
        for (Zaal zaal : zalen) {
            oppervlakte += zaal.BerekenOppervlakte();
        }

        return oppervlakte;
    }

    public void voegZaalToe(Zaal zaal) {
        zalen.add(zaal);
    }
}
