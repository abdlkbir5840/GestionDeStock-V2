package com.abdelkabir.dto;

import com.abdelkabir.model.Article;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class CategoryDto {
    private Integer id;
    private String codeCtegory;
    private String designation;
    @JsonIgnore
    private List<ArticleDto> articlesDtos;
}
