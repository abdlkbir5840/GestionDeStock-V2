package com.abdelkabir.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class LignCommandFournisseurDto {
    private Integer id;
    private CommandFournisseurDto commandFournisseurDto;
    private ArticleDto articleDto;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
