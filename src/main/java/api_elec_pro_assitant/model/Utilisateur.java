package api_elec_pro_assitant.model;

import jakarta.persistence.*;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "mot_de_passe", nullable = false)
    private String motDePasse;

    private String role;

    @Column(columnDefinition = "boolean default true")
    private Boolean actif = true;

    @Column(columnDefinition = "boolean default false")
    private Boolean bloquer = false;

    // Getters et setters...
}
