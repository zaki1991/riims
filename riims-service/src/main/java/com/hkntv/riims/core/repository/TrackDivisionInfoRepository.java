package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.TrackDivisionInfo;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackDivisionInfoRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("trackdivisioninfo") TrackDivisionInfo trackdivisioninfo);

    int insertSelective(@Param("trackdivisioninfo") TrackDivisionInfo trackdivisioninfo);

    TrackDivisionInfo selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("trackdivisioninfo") TrackDivisionInfo trackdivisioninfo);

    int updateByPrimaryKey(@Param("trackdivisioninfo") TrackDivisionInfo trackdivisioninfo);

    int selectCount(@Param("trackdivisioninfo") TrackDivisionInfo trackdivisioninfo);

    List<TrackDivisionInfo> selectPage(@Param("trackdivisioninfo") TrackDivisionInfo trackdivisioninfo, @Param("pageable") Pageable pageable);
}