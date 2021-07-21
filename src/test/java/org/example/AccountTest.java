package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void getBalance() {
        Account account1 = new Account();
        account1.setBalance(205.00);
        assertEquals(205.00, account1.getBalance(), 0.001);

    }

    @Test
    public void catchIncorrectBalance() {
        Account account3 = new Account();
        account3.setBalance(301.00);
        assertNotEquals(300.00, account3.getBalance(), 0.001);
    }




}