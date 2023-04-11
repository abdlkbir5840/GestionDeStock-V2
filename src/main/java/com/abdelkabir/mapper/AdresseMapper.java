package com.abdelkabir.mapper;

import com.abdelkabir.dto.AdresseDto;
import com.abdelkabir.model.Adresse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdresseMapper {
    AdresseDto fromEntity(Adresse adresse);
    Adresse toEntity(AdresseDto adresseDto);
    List<AdresseDto> modelsToDtos(List<Adresse> adresses);
}
