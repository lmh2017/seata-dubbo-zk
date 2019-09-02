package com.guardian.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 14:50
 */
@Repository
@Mapper
public interface AccountMapper {

    @Update("update account set total_amt = #{totalAmt}, usable_amt = #{usableAmt} where id = 1")
    int updateAccount(@Param("totalAmt")BigDecimal totalAmt,@Param("usableAmt") BigDecimal usableAmt);

}
