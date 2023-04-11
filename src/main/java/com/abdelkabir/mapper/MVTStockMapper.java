package com.abdelkabir.mapper;

import com.abdelkabir.dto.LignDeVenteDto;
import com.abdelkabir.dto.MVTStockDto;
import com.abdelkabir.model.LignDeVente;
import com.abdelkabir.model.MVTStock;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MVTStockMapper {
    MVTStockDto fromEntity(MVTStock mvtStock);
    MVTStock toEntity(MVTStockDto mvtStockDto);
    List<MVTStockDto> modelsToDtos(List<MVTStock> mvtStocks);
}
