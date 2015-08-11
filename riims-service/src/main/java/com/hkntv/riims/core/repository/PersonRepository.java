package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("person") Person person);

    int insertSelective(@Param("person") Person person);

    Person selectByPrimaryKey(@Param("guid") String guid);

    Person selectByWorkId(@Param("workId") String workId);

    int updateByPrimaryKeySelective(@Param("person") Person person);

    int updateByPrimaryKey(@Param("person") Person person);

    int selectCount(@Param("person") Person person);

    List<Person> selectPage(@Param("person") Person person, @Param("pageable") Pageable pageable);
}