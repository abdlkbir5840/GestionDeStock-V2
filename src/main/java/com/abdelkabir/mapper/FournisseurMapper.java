package com.abdelkabir.mapper;

import com.abdelkabir.dto.EntrepriseDto;
import com.abdelkabir.dto.FournisseurDto;
import com.abdelkabir.model.Entreprise;
import com.abdelkabir.model.Fournisseur;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FournisseurMapper {
    FournisseurDto fromEntity(Fournisseur fournisseur);
    Fournisseur toEntity(FournisseurDto fournisseurDto);
    List<FournisseurDto> modelsToDtos(List<Fournisseur> fournisseurs);
}
