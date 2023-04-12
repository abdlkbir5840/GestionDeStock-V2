package com.abdelkabir.validator;

import com.abdelkabir.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();
        if(utilisateurDto.equals(null)){
            errors.add("Veuillez renseignez le nom");
            errors.add("Veuillez renseignez le prenom");
            errors.add("Veuillez renseignez l'email");
            errors.add("Veuillez renseignez le password");
            errors.add("Veuillez renseignez la date de naissance");
            errors.add("Veuillez renseignez l'adresse");
            errors.add("Veuillez renseignez le pays");
            errors.add("Veuillez renseignez le code postale");
        }else {
            if(!StringUtils.hasLength(utilisateurDto.getNom())){
                errors.add("Veuillez renseignez le nom");
            }
            if(!StringUtils.hasLength(utilisateurDto.getPrenom())){
                errors.add("Veuillez renseignez le prenom");
            }
            if(!StringUtils.hasLength(utilisateurDto.getEmail())){
                errors.add("Veuillez renseignez l'email");
            }
            if(!StringUtils.hasLength(utilisateurDto.getPassword())){
                errors.add("Veuillez renseignez le password");
            }
            if(!StringUtils.hasLength(utilisateurDto.getDateNaissance().toString())){
                errors.add("Veuillez renseignez la date de naissance");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())){
                errors.add("Veuillez renseignez l'adresse");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
                errors.add("Veuillez renseignez le pays");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())){
                errors.add("Veuillez renseignez le code postale");
            }
        }
        return errors;
    }
}
