package com.abdelkabir.mapper;

import com.abdelkabir.dto.UtilisateurDto;
import com.abdelkabir.dto.VenteDto;
import com.abdelkabir.model.Utilisateur;
import com.abdelkabir.model.Vente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VenteMapper {
    VenteDto fromEntity(Vente vente);
    Vente toEntity(VenteDto venteDto);
    List<VenteDto> modelsToDtos(List<Vente> ventes);
}
