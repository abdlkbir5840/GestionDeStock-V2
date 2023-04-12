package com.abdelkabir.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.Instant;
import java.util.List;
@Data
@AllArgsConstructor
public class VenteDto {
    private Integer id;

    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String code;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private Instant dataVent;
    private String commantaire;
    private List<LignDeVenteDto> lignDeVenteDtos;
}
