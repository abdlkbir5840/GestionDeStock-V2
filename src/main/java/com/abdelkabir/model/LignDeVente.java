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
public class LignDeVente extends AbstractEntity{
    @ManyToOne
    private Vente vente;
    @ManyToOne
    private Article article;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
