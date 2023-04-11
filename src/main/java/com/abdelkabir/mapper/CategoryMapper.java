package com.abdelkabir.mapper;

import com.abdelkabir.dto.CategoryDto;
import com.abdelkabir.model.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto fromEntity(Category category);
    Category toEntity(CategoryDto categoryDto);
    List<CategoryDto> modelsToDtos(List<Category> categories);
}
