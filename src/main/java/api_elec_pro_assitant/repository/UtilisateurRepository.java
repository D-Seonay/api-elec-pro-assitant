package api_elec_pro_assitant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_elec_pro_assitant.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByEmail(String email);
}
