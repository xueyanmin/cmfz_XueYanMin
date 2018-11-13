package com.test;

import org.junit.Test;

public class String21 {
    public static void main(java.lang.String[] args) {
        String str="123456789";
        /*StringBuffer stringbuf=new StringBuffer(5566);
        StringBuffer reverse = stringbuf.reverse();*/
        int a=0;
        System.out.println(str.replace(str,"999966666"));
        System.out.println(str.indexOf("8"));
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
        System.out.println(str.toCharArray());
    }
}
