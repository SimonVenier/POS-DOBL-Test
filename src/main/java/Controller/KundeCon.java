package Controller;

import models.Kunde;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reps.KundeInter;
import reps.RechnungInter;
import service.KundeService;
import service.RechnungSevice;

import java.util.List;
public class KundeCon
{
    KundeInter kundeInter;
    RechnungInter rechnungInter;
    KundeService kundeService;
    RechnungSevice rechnungSevice;

    public KundeCon(KundeInter kundeInter, RechnungInter rechnungInter, KundeService kundeService, RechnungSevice rechnungSevice) {
        this.kundeInter = kundeInter;
        this.rechnungInter = rechnungInter;
        this.kundeService = kundeService;
        this.rechnungSevice = rechnungSevice;
    }

    @GetMapping("/kunden")
    public ResponseEntity<List<Kunde>> alleKunden()
    {
        return ResponseEntity.ok(kundeService.alleKunden());
    }

    @PostMapping("/kunde")
    public ResponseEntity<Kunde> kundeHizufuegen(@RequestBody Kunde kunde)
    {
        return ResponseEntity.ok(kundeService.kundeHinzufuegen(kunde));
    }

}
