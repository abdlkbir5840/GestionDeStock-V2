package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Entreprise extends AbstractEntity{

    private String nom;
    private String description;
    private String email;
    private String numTel;
    private String siteWeb;
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
