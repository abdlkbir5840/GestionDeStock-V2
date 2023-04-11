package com.abdelkabir.mapper;

import com.abdelkabir.dto.ClientDto;
import com.abdelkabir.model.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDto fromEntity(Client client);
    Client toEntity(ClientDto clientDto);
    List<ClientDto> modelsToDtos(List<Client> clients);
}
