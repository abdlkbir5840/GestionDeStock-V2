package com.abdelkabir.mapper;

import com.abdelkabir.dto.ClientDto;
import com.abdelkabir.dto.EntrepriseDto;
import com.abdelkabir.model.Client;
import com.abdelkabir.model.Entreprise;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntrepriseMapper {
    EntrepriseDto fromEntity(Entreprise entreprise);
    Entreprise toEntity(EntrepriseDto entrepriseDto);
    List<EntrepriseDto> modelsToDtos(List<Entreprise> entreprises);
}
