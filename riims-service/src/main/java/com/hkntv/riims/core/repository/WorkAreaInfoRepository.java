package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.WorkAreaInfo;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkAreaInfoRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("workareainfo") WorkAreaInfo workareainfo);

    int insertSelective(@Param("workareainfo") WorkAreaInfo workareainfo);

    WorkAreaInfo selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("workareainfo") WorkAreaInfo workareainfo);

    int updateByPrimaryKey(@Param("workareainfo") WorkAreaInfo workareainfo);

    int selectCount(@Param("workareainfo") WorkAreaInfo workareainfo);

    List<WorkAreaInfo> selectPage(@Param("workareainfo") WorkAreaInfo workareainfo, @Param("pageable") Pageable pageable);
}