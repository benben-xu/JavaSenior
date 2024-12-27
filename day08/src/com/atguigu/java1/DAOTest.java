package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author JiaMing_Xu
 * @create 2024-12-29-18:46
 */
public class DAOTest {

    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);
    }
}
