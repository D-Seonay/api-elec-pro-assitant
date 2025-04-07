package api_elec_pro_assitant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_elec_pro_assitant.model.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {
}
