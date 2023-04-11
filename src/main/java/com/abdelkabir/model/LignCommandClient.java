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
public class LignCommandClient extends AbstractEntity{
    @ManyToOne
    private Article article;
    @ManyToOne
    private CommandClient commandClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
