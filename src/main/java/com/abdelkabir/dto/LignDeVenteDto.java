package com.abdelkabir.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class LignDeVenteDto {
    private Integer id;
    private VenteDto venteDto;
    private ArticleDto articleDto;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
