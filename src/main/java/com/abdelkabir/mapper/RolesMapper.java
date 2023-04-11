package com.abdelkabir.mapper;

import com.abdelkabir.dto.MVTStockDto;
import com.abdelkabir.dto.RolesDto;
import com.abdelkabir.model.MVTStock;
import com.abdelkabir.model.Roles;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RolesMapper {
    RolesDto fromEntity(Roles roles);
    Roles toEntity(RolesDto rolesDto);
    List<RolesDto> modelsToDtos(List<Roles> roles);
}
