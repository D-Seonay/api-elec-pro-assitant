package api_elec_pro_assitant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_elec_pro_assitant.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
