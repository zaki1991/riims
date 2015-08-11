package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.Department;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("department") Department department);

    int insertSelective(@Param("department") Department department);

    Department selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("department") Department department);

    int updateByPrimaryKey(@Param("department") Department department);

    int selectCount(@Param("department") Department department);

    List<Department> selectPage(@Param("department") Department department, @Param("pageable") Pageable pageable);
}