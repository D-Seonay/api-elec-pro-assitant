package api_elec_pro_assitant.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;
    private LocalDate dateEmission;
    private Double validite;
    private Double montant;
    private String detail;
    private String statut;
    private String conditionsDePaiement;
    private String notesEtInformations;

    @ManyToOne
    @JoinColumn(name = "chantier_id")
    private Chantier chantier;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters et setters...
}
