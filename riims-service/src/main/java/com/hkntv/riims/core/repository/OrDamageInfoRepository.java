package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.OrDamageInfo;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrDamageInfoRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("ordamageinfo") OrDamageInfo ordamageinfo);

    int insertSelective(@Param("ordamageinfo") OrDamageInfo ordamageinfo);

    OrDamageInfo selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("ordamageinfo") OrDamageInfo ordamageinfo);

    int updateByPrimaryKey(@Param("ordamageinfo") OrDamageInfo ordamageinfo);

    int selectCount(@Param("ordamageinfo") OrDamageInfo ordamageinfo);

    List<OrDamageInfo> selectPage(@Param("ordamageinfo") OrDamageInfo ordamageinfo, @Param("pageable") Pageable pageable);
}