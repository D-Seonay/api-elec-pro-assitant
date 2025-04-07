package api_elec_pro_assitant.model;

import jakarta.persistence.*;

@Entity
public class CategorieMateriel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;

    // Getters et setters...
}
