package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.LineAreaInfo;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LineAreaInfoRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("lineareainfo") LineAreaInfo lineareainfo);

    int insertSelective(@Param("lineareainfo") LineAreaInfo lineareainfo);

    LineAreaInfo selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("lineareainfo") LineAreaInfo lineareainfo);

    int updateByPrimaryKey(@Param("lineareainfo") LineAreaInfo lineareainfo);

    int selectCount(@Param("lineareainfo") LineAreaInfo lineareainfo);

    List<LineAreaInfo> selectPage(@Param("lineareainfo") LineAreaInfo lineareainfo, @Param("pageable") Pageable pageable);
}