package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Roles extends AbstractEntity{

    private String roleName;
    @ManyToOne
    private Utilisateur utilisateur;
}
