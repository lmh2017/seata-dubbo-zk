package com.guardian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 15:51
 */
@Mapper
@Repository
public interface StorageMapper {

    @Update("update storage set stock = #{stock} where id = 1")
    int updateStorage(@Param("stock") Integer stock);

}
