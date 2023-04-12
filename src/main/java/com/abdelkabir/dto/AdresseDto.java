package com.abdelkabir.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class AdresseDto {
    @NotNull(message = "adresse 1 shouldn't be null")
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private String adresse1;
    private String adresse2;
    @NotNull(message = "ville shouldn't be null")
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private String ville;
    @NotNull(message = "code postale shouldn't be null")
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private String codePostale;
    @NotNull(message = "pays shouldn't be null")
    @NotBlank(message = "adresse 1 shouldn't be empty")
    private String pays;
}
