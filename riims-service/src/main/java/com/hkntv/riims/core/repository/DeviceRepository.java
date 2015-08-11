package com.hkntv.riims.core.repository;

import com.hkntv.riims.core.entity.Device;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository {
    int deleteByPrimaryKey(@Param("guid") String guid);

    int insert(@Param("device") Device device);

    int insertSelective(@Param("device") Device device);

    Device selectByPrimaryKey(@Param("guid") String guid);

    int updateByPrimaryKeySelective(@Param("device") Device device);

    int updateByPrimaryKey(@Param("device") Device device);

    int selectCount(@Param("device") Device device);

    List<Device> selectPage(@Param("device") Device device, @Param("pageable") Pageable pageable);
}