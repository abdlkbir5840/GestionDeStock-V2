package com.abdelkabir.dto;

import com.abdelkabir.model.Adresse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@AllArgsConstructor
public class UtilisateurDto {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Instant dateNaissance;
    private String photo;
    private Adresse adresse;
    private EntrepriseDto entrepriseDto;
    private List<RolesDto> rolesDtos;
}
