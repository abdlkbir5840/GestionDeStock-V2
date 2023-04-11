package com.abdelkabir.dto;

import com.abdelkabir.model.Adresse;
import com.abdelkabir.model.CommandClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
public class ClientDto {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String numTel;
    private Adresse adresse;
    @JsonIgnore
    private List<CommandClientDto> commandClientDtos;
}
