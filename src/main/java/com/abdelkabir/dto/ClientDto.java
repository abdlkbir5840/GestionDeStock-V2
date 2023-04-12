package com.abdelkabir.dto;

import com.abdelkabir.model.Adresse;
import com.abdelkabir.model.CommandClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;
@Data
@NoArgsConstructor
public class ClientDto {
    private Integer id;
    @NotNull(message = "nom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String nom;
    @NotNull(message = "prenom shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private String prenom;
    @Email(message = "invaldi email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number")
    private String numTel;
    @NotNull(message = "adresse shouldn't be null")
    @NotBlank(message = "nom shouldn't be empty")
    private Adresse adresse;
    @JsonIgnore
    private List<CommandClientDto> commandClientDtos;
}
