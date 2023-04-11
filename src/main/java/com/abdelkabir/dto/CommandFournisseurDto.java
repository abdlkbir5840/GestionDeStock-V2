package com.abdelkabir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@AllArgsConstructor
public class CommandFournisseurDto {
    private Integer id;
    private String code;
    private Instant dateCommand;
    private FournisseurDto fournisseurDto;
    private List<LignCommandFournisseurDto> lignCommandFournisseurDtos;
}
