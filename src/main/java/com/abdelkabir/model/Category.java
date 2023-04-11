package com.abdelkabir.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Category extends AbstractEntity{
    private String codeCtegory;
    private String designation;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
