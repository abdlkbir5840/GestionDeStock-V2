package com.abdelkabir.dto;

import com.abdelkabir.model.TypeMvtStock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
@Data
@AllArgsConstructor
public class MVTStockDto {
    private Integer id;
    private ArticleDto articleDto;

    private Instant dateMvt;
    private BigDecimal quantite;
    private TypeMvtStock typeMvtStock;
}
