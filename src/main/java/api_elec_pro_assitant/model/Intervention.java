package api_elec_pro_assitant.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private LocalDate date;
    private Double dureeHeure;
    private String adresse;
    private String ville;
    private String priorite;
    private String codePostal;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "chantier_id")
    private Chantier chantier;

    // Getters et setters...
}
