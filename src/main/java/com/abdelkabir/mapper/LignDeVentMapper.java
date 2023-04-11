package com.abdelkabir.mapper;

import com.abdelkabir.dto.LignCommandFournisseurDto;
import com.abdelkabir.dto.LignDeVenteDto;
import com.abdelkabir.model.LignCommandFournisseur;
import com.abdelkabir.model.LignDeVente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LignDeVentMapper {
    LignDeVenteDto fromEntity(LignDeVente lignDeVente);
    LignDeVente toEntity(LignDeVenteDto lignDeVenteDto);
    List<LignDeVenteDto> modelsToDtos(List<LignDeVente> lignDeVentes);
}
