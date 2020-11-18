package service;

import models.Kunde;
import models.Rechnung;
import reps.KundeInter;
import reps.RechnungInter;

import java.util.List;
import java.util.Optional;

public class KundeService
{
    KundeInter kundeInter;
    RechnungInter rechnungInter;

    public KundeService(KundeInter kundeInter, RechnungInter rechnungInter)
    {
        this.kundeInter = kundeInter;
        this.rechnungInter = rechnungInter;
    }

    public KundeInter getKundeInter() {
        return kundeInter;
    }

    public void setKundeInter(KundeInter kundeInter) {
        this.kundeInter = kundeInter;
    }

    public RechnungInter getRechnungInter() {
        return rechnungInter;
    }

    public void setRechnungInter(RechnungInter rechnungInter) {
        this.rechnungInter = rechnungInter;
    }

    public List<Kunde> getKundeById(Long id) throws Exception
    {
        Optional<Kunde> k = kundeInter.findById(id);
        if(k.isPresent())
        {
            return (List<Kunde>) k.get();
        }
        else
        {
            throw new Exception("Falshc ID oder sie gibt es nicht");
        }
    }

    public Kunde kundeHinzufuegen(Kunde kunde)
    {
        return kundeInter.save(kunde);
    }

    public List<Kunde> alleKunden()
    {
        return kundeInter.findAll();
    }
}
