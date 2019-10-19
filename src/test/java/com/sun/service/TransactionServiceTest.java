package com.sun.service;

import com.sun.BaseTest;
import org.junit.Test;


import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionServiceTest extends BaseTest {
    @Resource
    private TransactionService transactionService;

    @Test
    public void inset() {
        transactionService.insert();
    }

    @Test
    public void test(){
        transactionService.test();
    }
}