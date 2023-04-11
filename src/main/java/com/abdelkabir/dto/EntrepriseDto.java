package com.abdelkabir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class EntrepriseDto {
    private Integer id;
    private String nom;
    private String description;
    private String email;
    private String numTel;
    private String siteWeb;
    private List<UtilisateurDto> utilisateurDtos;
}
