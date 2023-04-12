package com.abdelkabir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;
@Data
@AllArgsConstructor
public class CommandFournisseurDto {
    private Integer id;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String code;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private Instant dateCommand;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private FournisseurDto fournisseurDto;
    private List<LignCommandFournisseurDto> lignCommandFournisseurDtos;
}
