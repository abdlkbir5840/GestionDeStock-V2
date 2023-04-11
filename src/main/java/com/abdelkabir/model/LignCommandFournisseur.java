package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LignCommandFournisseur extends AbstractEntity{

    @ManyToOne
    private CommandFournisseur commandFournisseur;
    @ManyToOne
    private Article article;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;


}
