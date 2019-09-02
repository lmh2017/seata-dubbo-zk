package com.guardian.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 15:05
 */
@Mapper
@Repository
public interface OrderMapper {

    @Insert("insert into `order` (order_no,order_time) values(#{orderNo},#{orderTime})")
    void insertOrder(@Param("orderNo") String orderNo, @Param("orderTime")Date orderTime);

}
