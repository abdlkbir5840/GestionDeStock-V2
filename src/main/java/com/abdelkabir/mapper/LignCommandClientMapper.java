package com.abdelkabir.mapper;

import com.abdelkabir.dto.FournisseurDto;
import com.abdelkabir.dto.LignCommandClientDto;
import com.abdelkabir.model.Fournisseur;
import com.abdelkabir.model.LignCommandClient;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LignCommandClientMapper {
    LignCommandClientDto fromEntity(LignCommandClient lignCommandClient);
    LignCommandClient toEntity(LignCommandClientDto lignCommandClientDto);
    List<LignCommandClientDto> modelsToDtos(List<LignCommandClient> lignCommandClients);
}
