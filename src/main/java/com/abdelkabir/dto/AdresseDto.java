package com.abdelkabir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class AdresseDto {
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostale;
    private String pays;
}
