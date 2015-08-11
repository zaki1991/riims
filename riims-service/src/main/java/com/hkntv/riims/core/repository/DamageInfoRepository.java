package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.DamageInfo;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DamageInfoRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("damageinfo") DamageInfo damageinfo);

    int insertSelective(@Param("damageinfo") DamageInfo damageinfo);

    DamageInfo selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("damageinfo") DamageInfo damageinfo);

    int updateByPrimaryKey(@Param("damageinfo") DamageInfo damageinfo);

    int selectCount(@Param("damageinfo") DamageInfo damageinfo);

    List<DamageInfo> selectPage(@Param("damageinfo") DamageInfo damageinfo, @Param("pageable") Pageable pageable);
}