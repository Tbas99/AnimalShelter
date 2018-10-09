package SOLID.I;

public interface IRekening
{
    public void Storting(double bedrag);
    public void GeldOvermaken(double bedrag, String rekeningOntvanger);
}
