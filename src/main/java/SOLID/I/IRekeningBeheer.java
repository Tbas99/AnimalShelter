package SOLID.I;

public interface IRekeningBeheer
{
    public void WijzigNaam(String nieuweNaam);
    public void WijzigAdres(String nieuwAdres);
    public void GeldOntvangen(double bedrag, String rekeningZender);
}
