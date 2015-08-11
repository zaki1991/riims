package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.Station;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("station") Station station);

    int insertSelective(@Param("station") Station station);

    Station selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("station") Station station);

    int updateByPrimaryKey(@Param("station") Station station);

    int selectCount(@Param("station") Station station);

    List<Station> selectPage(@Param("station") Station station, @Param("pageable") Pageable pageable);
}