package com.abdelkabir.dto;

import com.abdelkabir.model.Adresse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.Instant;
import java.util.List;
@Data
@AllArgsConstructor
public class UtilisateurDto {
    private Integer id;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String nom;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String prenom;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    @Email(message = "invalid email address")
    private String email;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String password;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private Instant dateNaissance;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String photo;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private Adresse adresse;
    private EntrepriseDto entrepriseDto;
    private List<RolesDto> rolesDtos;
}
