package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Article extends AbstractEntity {

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitHTax;

    private BigDecimal tauxTVA;

    private BigDecimal prixUnitTTC;

    private String photo;
    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "article")
    private List<LignCommandClient> lignCommandClient;

    @OneToMany(mappedBy = "article")
    private List<LignCommandFournisseur> lignCommandFournisseurs;

    @OneToMany(mappedBy = "article")
    private List<LignDeVente> lignDeVentes;

    @OneToMany(mappedBy = "article")
    private List<MVTStock> mvtStocks;

}
