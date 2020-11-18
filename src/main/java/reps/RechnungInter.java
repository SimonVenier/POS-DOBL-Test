package reps;

import models.Rechnung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RechnungInter extends JpaRepository<Rechnung, Long> {
}
