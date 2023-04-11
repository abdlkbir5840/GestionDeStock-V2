package com.abdelkabir.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
public class RolesDto {
    private Integer id;
    private String roleName;
    private UtilisateurDto utilisateurDto;
}
