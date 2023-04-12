package com.abdelkabir.dto;

import com.abdelkabir.model.TypeMvtStock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.Instant;
@Data
@AllArgsConstructor
public class MVTStockDto {
    private Integer id;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private ArticleDto articleDto;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private Instant dateMvt;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    @Pattern(regexp = "^[0-9\\s]",message = "invalid number")
    private BigDecimal quantite;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private TypeMvtStock typeMvtStock;
}
