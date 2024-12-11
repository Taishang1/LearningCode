package com.itbaizhan.service;

import com.itbaizhan.dao.AccountDao;
import com.itbaizhan.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    /**
     * 转账
     * @param id1 转出人id
     * @param id2 转入人id
     * @param price 金额
     */
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public void transfer(int id1,int id2,double price){
        // 转出人减少余额
        Account account1 = accountDao.findById(id1);
        account1.setBalance(account1.getBalance()-price);
        accountDao.update(account1);

//        int i = 1/0;

        // 转入人增加余额
        Account account2 = accountDao.findById(id2);
        account2.setBalance(account2.getBalance()+price);
        accountDao.update(account2);
    }
}
