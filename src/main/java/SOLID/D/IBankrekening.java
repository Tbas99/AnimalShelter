package SOLID.D;

public interface IBankrekening
{
    public double BoekGeldOver(double bedrag, double tegenRekening);
    public double pinTransactie(double bedrag, double tegenRekening);
}
