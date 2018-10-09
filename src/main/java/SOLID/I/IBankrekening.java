package SOLID.I;

public interface IBankrekening
{
    public void WijzigNaam(String nieuweNaam);

    public void WijzigAdres(String nieuwAdres);

    public void GeldOntvangen(double bedrag, String rekeningZender);

    public void Storting(double bedrag);

    public void GeldOvermaken(double bedrag, String rekeningOntvanger);

    public void Pinnen(double bedrag, String rekeningNummerWinkel);
}
