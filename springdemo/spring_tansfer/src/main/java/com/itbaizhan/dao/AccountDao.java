package com.itbaizhan.dao;

import com.itbaizhan.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {
    // 根据id查找用户
    @Select("select * from account where id = #{id}")
    Account findById(int id);

    // 修改用户
    @Update("update account set balance = #{balance} where id = #{id}")
    void update(Account account);
}
