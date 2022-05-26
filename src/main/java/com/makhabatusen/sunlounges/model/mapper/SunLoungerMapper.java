package com.makhabatusen.sunlounges.model.mapper;
import com.makhabatusen.sunlounges.model.dto.SunLoungerDto;
import com.makhabatusen.sunlounges.model.entity.SunLounger;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SunLoungerMapper extends BaseMapper<SunLounger, SunLoungerDto>{
    SunLoungerMapper INSTANCE = Mappers.getMapper(SunLoungerMapper.class);

}