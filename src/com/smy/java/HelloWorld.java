package com.smy.java;

import sun.awt.geom.AreaOp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;


// 注释
public class HelloWorld {


    private static int num;

    public static void main(String[] args) {
        System.out.println("hello world");

        ArrayList list = new ArrayList();
        list.add(0, 123);

        Date data = new Date();
        method1();

    }

    public static void method1() {

        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();


    }
}



