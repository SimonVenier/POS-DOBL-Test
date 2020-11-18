package com.example.demo;

import models.Kunde;
import models.Rechnung;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reps.KundeInter;
import reps.RechnungInter;

@SpringBootApplication
public class DemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }

    public CommandLineRunner ausgaben(KundeInter kundeInter, RechnungInter rechnungInter)
    {
        return (args) ->
        {
            Kunde k1 = new Kunde();
            k1.setVorname("Simon");
            System.out.println(kundeInter);

            Rechnung r1 = new Rechnung();
            r1.getRechnungsbetrag();
            System.out.println(rechnungInter);

        };

    }

}


