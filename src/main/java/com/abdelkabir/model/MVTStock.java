package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MVTStock extends AbstractEntity{
    @ManyToOne
    private Article article;

    private Instant dateMvt;
    private BigDecimal quantite;
    private TypeMvtStock typeMvtStock;
}
