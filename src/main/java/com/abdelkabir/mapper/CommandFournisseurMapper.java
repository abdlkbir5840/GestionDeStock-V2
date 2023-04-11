package com.abdelkabir.mapper;

import com.abdelkabir.dto.CommandClientDto;
import com.abdelkabir.dto.CommandFournisseurDto;
import com.abdelkabir.model.CommandClient;
import com.abdelkabir.model.CommandFournisseur;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommandFournisseurMapper {
    CommandFournisseurDto fromEntity(CommandFournisseur commandFournisseur);
    CommandFournisseur toEntity(CommandFournisseurDto commandFournisseurDto);
    List<CommandFournisseurDto> modelsToDtos(List<CommandFournisseur> commandFournisseurs);
}
