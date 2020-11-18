package service;

import models.Kunde;
import models.Rechnung;
import reps.KundeInter;
import reps.RechnungInter;

import java.util.List;
import java.util.Optional;

public class RechnungSevice
{
    RechnungInter rechnungInter;
    KundeInter kundeInter;

    public RechnungSevice(RechnungInter rechnungInter, KundeInter kundeInter) {
        this.rechnungInter = rechnungInter;
        this.kundeInter = kundeInter;
    }

    public RechnungInter getRechnungInter() {
        return rechnungInter;
    }

    public void setRechnungInter(RechnungInter rechnungInter) {
        this.rechnungInter = rechnungInter;
    }

    public KundeInter getKundeInter() {
        return kundeInter;
    }

    public void setKundeInter(KundeInter kundeInter) {
        this.kundeInter = kundeInter;
    }

    public Rechnung rechnungHinzufuegen(Rechnung rechnung)
    {
        return rechnungInter.save(rechnung);
    }

    public List<Rechnung> alleRechnungen()
    {
        return rechnungInter.findAll();
    }

    public List<Rechnung> getRechnungById(Long id) throws Exception
    {
        Optional<Rechnung> r = rechnungInter.findById(id);
        if(r.isPresent())
        {
            return (List<Rechnung>) r.get();
        }
        else
        {
            throw new Exception("Rechnung gibt es nicht!");
        }
    }

}
