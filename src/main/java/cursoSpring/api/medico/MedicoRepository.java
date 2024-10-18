package cursoSpring.api.medico;

import cursoSpring.api.conreoller.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
