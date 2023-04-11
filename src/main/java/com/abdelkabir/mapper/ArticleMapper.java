package com.abdelkabir.mapper;

import com.abdelkabir.dto.ArticleDto;
import com.abdelkabir.model.Article;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleDto fromEntity(Article article);
    Article toEntity(ArticleDto articleDto);
    List<ArticleDto> modelsToDtos(List<Article> articles);
}
