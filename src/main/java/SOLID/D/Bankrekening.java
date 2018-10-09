package SOLID.D;

public class Bankrekening implements IBankrekening
{
    public double TariefOverboeking = 0.10;

    public double TariefPinTransactie = 0.05;

    @Override
    public double BoekGeldOver(double bedrag, double tegenRekening) {
        return tegenRekening -= (bedrag + TariefOverboeking);
    }

    @Override
    public double pinTransactie(double bedrag, double tegenRekening) {
        return tegenRekening -= (bedrag + TariefPinTransactie);
    }
}
