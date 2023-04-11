package com.abdelkabir.mapper;

import com.abdelkabir.dto.RolesDto;
import com.abdelkabir.dto.UtilisateurDto;
import com.abdelkabir.model.Roles;
import com.abdelkabir.model.Utilisateur;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    UtilisateurDto fromEntity(Utilisateur utilisateur);
    Utilisateur toEntity(UtilisateurDto utilisateurDto);
    List<UtilisateurDto> modelsToDtos(List<Utilisateur> utilisateurs);
}
