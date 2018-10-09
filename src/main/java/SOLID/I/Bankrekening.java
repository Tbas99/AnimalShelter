package SOLID.I;

import java.util.ArrayList;
import java.util.List;

public class Bankrekening implements IRekeningBeheer, IRekening, IWinkelRekening
{
    public String _naam;
    public String _adres;
    public String _rekeningNummer;
    public double _saldo;
    public List<String> _ontvangenTransacties;
    public List<String> _verzondenTransacties;


    public Bankrekening(String naam, String adres, String rekeningNummer) {
        _naam = naam;
        _adres = adres;
        _rekeningNummer = rekeningNummer;
        _ontvangenTransacties = new ArrayList<>();
        _verzondenTransacties = new ArrayList<>();
    }

    public void WijzigNaam(String nieuweNaam) {
        _naam = nieuweNaam;
    }

    public void WijzigAdres(String nieuwAdres) {
        _adres = nieuwAdres;
    }

    public void GeldOntvangen(double bedrag, String rekeningZender) {
        _saldo += bedrag;
        _ontvangenTransacties.add(rekeningZender);
    }

    public void Storting(double bedrag) {
        _saldo += bedrag;
    }

    public void GeldOvermaken(double bedrag, String rekeningOntvanger) {
        _saldo -= bedrag;
        _verzondenTransacties.add(rekeningOntvanger);
    }

    public void Pinnen(double bedrag, String rekeningNummerWinkel) {
        _saldo -= bedrag;
        _verzondenTransacties.add(rekeningNummerWinkel);
    }
}
