package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vente extends AbstractEntity{

    private String code;
    private Instant dataVent;
    private String commantaire;
    @OneToMany(mappedBy = "vente")
    private List<LignDeVente> lignDeVentes;

}
