package com.tamer.aopdemo.dao;

import com.tamer.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

}