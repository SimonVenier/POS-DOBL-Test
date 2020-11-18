package models;

import javax.persistence.*;
import java.util.List;

public class Kunde
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Nachname;
    private String Vorname;

    @OneToMany(mappedBy = "kunde")
    private List<Rechnung> rechnungen;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public List<Rechnung> getRechnungen() {
        return rechnungen;
    }

    public void setRechnungen(List<Rechnung> rechnungen) {
        this.rechnungen = rechnungen;
    }
}
