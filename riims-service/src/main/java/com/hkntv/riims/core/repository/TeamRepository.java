package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.Team;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("team") Team team);

    int insertSelective(@Param("team") Team team);

    Team selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("team") Team team);

    int updateByPrimaryKey(@Param("team") Team team);

    int selectCount(@Param("team") Team team);

    List<Team> selectPage(@Param("team") Team team, @Param("pageable") Pageable pageable);
}