package com.smy.java;

import com.hujiang.bean.Customer;
import com.sun.tools.internal.xjc.model.CPropertyVisitor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author songmengyun
 * @date 2020/3/24 - 5:56 下午
 */


public class TemplateTest {

    private static final Customer cust = new Customer();

    public static void main(String[] args) {


        // sout
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        int num = 10;
        System.out.println("num = " + num);

        String[] arr = new String[]{"name1", "name2", "name3", "name4"};

        // fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // iter 增强for循环
        for (String s : arr) {
            System.out.println(s);

        }

        // itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        // list for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add("abc");
        for (int i = 0; i < list.size(); i++) {
            
        }

    }

    public void method(){
        System.out.println("TemplateTest.method");

        // ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add("abc");

        if (list == null) {
            System.out.println(list);
        }
        if (list != null) {

        }


    }
    
    public void testABC(){
        System.out.println("Hello World");
    }


}
