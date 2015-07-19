package com.thoughtworks.tddintro.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    private Account account;

    @Before
    public void setUp() throws Exception {
        account= new Account(100);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        assertThat(account.transaction(50), is(150.0));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){;
        assertThat(account.transaction(-50), is(50.0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50);
        assertThat(account.transaction(-100), is(50.0));
    }
}
