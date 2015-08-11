package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.LineInfo;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LineInfoRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("lineinfo") LineInfo lineinfo);

    int insertSelective(@Param("lineinfo") LineInfo lineinfo);

    LineInfo selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("lineinfo") LineInfo lineinfo);

    int updateByPrimaryKey(@Param("lineinfo") LineInfo lineinfo);

    int selectCount(@Param("lineinfo") LineInfo lineinfo);

    List<LineInfo> selectPage(@Param("lineinfo") LineInfo lineinfo, @Param("pageable") Pageable pageable);
}