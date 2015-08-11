package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.JobInfo;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInfoRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("jobinfo") JobInfo jobinfo);

    int insertSelective(@Param("jobinfo") JobInfo jobinfo);

    JobInfo selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("jobinfo") JobInfo jobinfo);

    int updateByPrimaryKey(@Param("jobinfo") JobInfo jobinfo);

    int selectCount(@Param("jobinfo") JobInfo jobinfo);

    List<JobInfo> selectPage(@Param("jobinfo") JobInfo jobinfo, @Param("pageable") Pageable pageable);
}