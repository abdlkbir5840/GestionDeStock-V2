package com.abdelkabir.dto;

import com.abdelkabir.model.Client;
import com.abdelkabir.model.LignCommandClient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
public class CommandClientDto {
    private Integer id;
    private String code;
    private Date dateCommande;
    private ClientDto clientDto;
    private List<LignCommandClientDto> lignCommandClientDtos;
}
