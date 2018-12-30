package com.cncnc;

import java.util.HashMap;
import java.util.Map;

/**
 * git练习
 *
 * @author tukangzheng
 * @create 2018-11-14 上午10:03
 **/
public class Main {

    private static final Map<String, String> map = new HashMap<>();

    static {
        for (int i = 1; i <= 10; i++){
            map.put("key" + i, "value" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("=======================start======================");
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + (i*j) + "  ");
            }
            System.out.println();
        }
        System.out.println("=======================end======================");

        test();

        test1();
    }


    private static void test(){
        map.put("test-key", "test-value");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


    private static void test1(){
        System.out.println("Hello World!");
        System.out.println(System.currentTimeMillis());
    }


    private static void test2(){
        System.out.println("this branch is test2");
    }

    private static void test3(){
        System.out.println("this branch is test3");
    }

    private static void test4(){
        System.out.println("this branch is test4");
    }

    private static void test6(){
        System.out.println("this branch is test6");
        System.out.println("modify master branch test!");
        System.out.println("test_rebase");
    }
}
