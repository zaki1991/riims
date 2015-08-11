package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.Units;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitsRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("units") Units units);

    int insertSelective(@Param("units") Units units);

    Units selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("units") Units units);

    int updateByPrimaryKey(@Param("units") Units units);

    int selectCount(@Param("units") Units units);

    List<Units> selectPage(@Param("units") Units units, @Param("pageable") Pageable pageable);
}