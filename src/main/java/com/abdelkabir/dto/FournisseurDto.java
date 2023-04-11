package com.abdelkabir.dto;

import com.abdelkabir.model.Adresse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class FournisseurDto {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String numTel;
    private Adresse adresse;
    private List<CommandFournisseurDto> commandFournisseurDtos;
}
