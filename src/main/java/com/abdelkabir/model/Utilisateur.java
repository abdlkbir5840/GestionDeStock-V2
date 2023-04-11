package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur extends AbstractEntity{
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Instant dateNaissance;
    private String photo;
    @Embedded
    private Adresse adresse;
    @ManyToOne
    private Entreprise entreprise;
    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;
}
