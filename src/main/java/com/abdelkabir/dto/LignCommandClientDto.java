package com.abdelkabir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class LignCommandClientDto {
    private Integer id;
    private ArticleDto articleDto;
    private CommandClientDto commandClientDto;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
