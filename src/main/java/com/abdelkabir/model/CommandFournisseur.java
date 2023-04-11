package com.abdelkabir.model;

import lombok.*;

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
public class CommandFournisseur extends AbstractEntity{

    private String code;
    private Instant dateCommand;
    @ManyToOne
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "commandFournisseur")
    private List<LignCommandFournisseur> lignCommandFournisseurs;
}
