package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.Admin;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository {
    int deleteByPrimaryKey(@Param("id") String id);

    int insert(@Param("admin") Admin admin);

    int insertSelective(@Param("admin") Admin admin);

    Admin selectByPrimaryKey(@Param("id") String id);

    int updateByPrimaryKeySelective(@Param("admin") Admin admin);

    int updateByPrimaryKey(@Param("admin") Admin admin);

    int selectCount(@Param("admin") Admin admin);

    List<Admin> selectPage(@Param("admin") Admin admin, @Param("pageable") Pageable pageable);
}