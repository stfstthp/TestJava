package com.Stack.test;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        LT lt = new LT();
//        String str = "9+(3-1)*3+10/2";
        String str = "3*(4+5)*6";
        List<String> list = lt.work(str);
        List<String> list2 = lt.InfixToPostfix(list);
        System.out.println("原式为：" + str);
        System.out.print("后缀表达式为：");
        lt.printList(list2);
        System.out.println(" ");
        System.out.println("计算结果为：" + lt.doCal(list2));
        int a =4;
        if(a>=3 && a<=7 && (a % 2!=0)){
            System.out.println("yes");
        }else{
            System.out.println("false");
        }


    }
}
