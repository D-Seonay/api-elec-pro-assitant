package api_elec_pro_assitant.model;

import jakarta.persistence.*;

@Entity
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    private String telephone;
    private String adresse;
    private String ville;
    private String codePostal;
    private String contactPersonne;

    // Getters et setters...
}
