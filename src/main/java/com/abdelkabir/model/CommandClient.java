package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CommandClient extends AbstractEntity {
    private String code;
    private Date dateCommande;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "commandClient")
    private List<LignCommandClient> lignCommandClients;
}
