package api_elec_pro_assitant.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Materiel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;
    private String nom;
    private String description;
    private Integer quantiteDisponible;
    private LocalDate dateAchat;

    @ManyToOne
    @JoinColumn(name = "chantier_id")
    private Chantier chantier;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategorieMateriel categorie;

    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

    // Getters et setters...
}
