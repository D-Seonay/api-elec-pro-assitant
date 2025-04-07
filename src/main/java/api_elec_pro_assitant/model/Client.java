package api_elec_pro_assitant.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String contact;
    private String email;
    private String telephone;
    private String adresse;
    private String ville;
    private String codePostal;
    private String type;
    private String note;

    @Column(name = "create_at")
    private LocalDate createAt;

    // Getters et setters...
}
