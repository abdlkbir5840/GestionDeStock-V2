package com.abdelkabir.mapper;

import com.abdelkabir.dto.CommandClientDto;
import com.abdelkabir.model.CommandClient;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommandClientMapper {
    CommandClientDto fromEntity(CommandClient commandClient);
    CommandClient toEntity(CommandClientDto commandClientDto);
    List<CommandClientDto> modelsToDtos(List<CommandClient> commandClients);
}
