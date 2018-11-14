package com.cncnc;

/**
 * git练习
 *
 * @author tukangzheng
 * @create 2018-11-14 上午10:03
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println("=======================start======================");
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + (i*j) + "  ");
            }
            System.out.println();
        }
        System.out.println("=======================end======================");
    }
}
