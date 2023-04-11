package com.abdelkabir.mapper;

import com.abdelkabir.dto.LignCommandFournisseurDto;
import com.abdelkabir.model.LignCommandFournisseur;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LignCommandFournisseurMapper {
    LignCommandFournisseurDto fromEntity(LignCommandFournisseur lignCommandFournisseur);
    LignCommandFournisseur toEntity(LignCommandFournisseurDto lignCommandFournisseurDto);
    List<LignCommandFournisseurDto> modelsToDtos(List<LignCommandFournisseur> lignCommandFournisseurs);
}
