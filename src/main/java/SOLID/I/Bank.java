package SOLID.I;

public class Bank implements IRekeningBeheer
{
    private Bankrekening _bankrekening;

    public Bank(Bankrekening bankrekening) {
        _bankrekening = bankrekening;
    }

    @Override
    public void WijzigNaam(String nieuweNaam) {
        _bankrekening._naam = nieuweNaam;
    }

    @Override
    public void WijzigAdres(String nieuwAdres) {
        _bankrekening._adres = nieuwAdres;
    }

    @Override
    public void GeldOntvangen(double bedrag, String rekeningZender) {
        _bankrekening._saldo -= bedrag;
        _bankrekening._ontvangenTransacties.add(rekeningZender);
    }
}
