package models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rechnung
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int Rechnungsnummer;
    private String Rechnungsdatum;
    private double Rechnungsbetrag;

    @ManyToOne
    @JoinColumn
    private Kunde kunde;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRechnungsnummer() {
        return Rechnungsnummer;
    }

    public void setRechnungsnummer(int rechnungsnummer) {
        Rechnungsnummer = rechnungsnummer;
    }

    public String getRechnungsdatum() {
        return Rechnungsdatum;
    }

    public void setRechnungsdatum(String rechnungsdatum) {
        Rechnungsdatum = rechnungsdatum;
    }

    public double getRechnungsbetrag() {
        return Rechnungsbetrag;
    }

    public void setRechnungsbetrag(double rechnungsbetrag) {
        Rechnungsbetrag = rechnungsbetrag;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
