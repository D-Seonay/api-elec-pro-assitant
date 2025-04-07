package api_elec_pro_assitant.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Chantier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private String adresse;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters et setters...
}
