package Controller;

import models.Kunde;
import models.Rechnung;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.RechnungSevice;

import java.util.List;

public class RechnungCon
{
    private RechnungSevice rechnungSevice;

    public RechnungCon(RechnungSevice rechnungSevice) {
        this.rechnungSevice = rechnungSevice;
    }

    @GetMapping("/rechnungen")
    public ResponseEntity<List<Rechnung>> alleRechnungen()
    {
        return ResponseEntity.ok(rechnungSevice.alleRechnungen());
    }

    @PostMapping("/rechnung")
    public ResponseEntity<Rechnung> rechnungHizufuegen(@RequestBody Rechnung rechnung)
    {
        return ResponseEntity.ok(rechnungSevice.rechnungHinzufuegen(rechnung));
    }
}
