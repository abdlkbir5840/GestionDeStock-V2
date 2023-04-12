package com.abdelkabir.validator;

import com.abdelkabir.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {
    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<>();
        if(categoryDto.equals(null) || !StringUtils.hasLength(categoryDto.getCodeCtegory())){
            errors.add("Veuillez renseignez le code");
        }
        return errors;
    }
}
