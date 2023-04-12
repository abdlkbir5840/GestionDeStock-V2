package com.abdelkabir.dto;

import com.abdelkabir.model.*;
import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class ArticleDto {
    private Integer id;
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private String codeArticle;
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private String designation;
    @NotBlank(message = "adresse 1 shouldn't be empty")
    @Pattern(regexp = "^[0-9\\s]",message = "invalid number")
    private BigDecimal prixUnitHTax;
    @NotBlank(message = "adresse 1 shouldn't be empty")
    @Pattern(regexp = "^[0-9\\s]",message = "invalid number")
    private BigDecimal tauxTVA;
    @NotBlank(message = "adresse 1 shouldn't be empty")
    @Pattern(regexp = "^[0-9\\s]",message = "invalid number")
    private BigDecimal prixUnitTTC;
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private String photo;
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private CategoryDto categoryDto;
    private List<LignCommandClientDto> lignCommandClientDtos;
    private List<LignCommandFournisseurDto> lignCommandFournisseurDtos;
    private List<LignDeVenteDto> lignDeVenteDtos;
    private List<MVTStockDto> mvtStockDtos;
}
