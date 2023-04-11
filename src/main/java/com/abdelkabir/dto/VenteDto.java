package com.abdelkabir.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@AllArgsConstructor
public class VenteDto {
    private Integer id;
    private String code;
    private Instant dataVent;
    private String commantaire;
    private List<LignDeVenteDto> lignDeVenteDtos;
}
