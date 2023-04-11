package com.abdelkabir.dto;

import com.abdelkabir.model.*;
import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class ArticleDto {
    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitHTax;
    private BigDecimal tauxTVA;
    private BigDecimal prixUnitTTC;
    private String photo;
    private CategoryDto categoryDto;
    private List<LignCommandClientDto> lignCommandClientDtos;
    private List<LignCommandFournisseurDto> lignCommandFournisseurDtos;
    private List<LignDeVenteDto> lignDeVenteDtos;
    private List<MVTStockDto> mvtStockDtos;
}
