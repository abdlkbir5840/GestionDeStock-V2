package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client extends AbstractEntity{

    private String nom;
    private String prenom;
    private String email;
    private String numTel;
    @Embedded
    private Adresse adresse;
    @OneToMany(mappedBy = "client")
    private List<CommandClient> commandClients;

}
