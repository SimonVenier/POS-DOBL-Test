package reps;

import models.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundeInter extends JpaRepository<Kunde, Long> {
}
