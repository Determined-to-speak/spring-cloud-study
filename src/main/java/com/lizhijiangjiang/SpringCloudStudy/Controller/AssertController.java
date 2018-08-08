package com.lizhijiangjiang.SpringCloudStudy.Controller;

public class AssertController {
    public static void main(String[] args) {
        Boolean x=true;
        System.out.println("Testing Assertion that x==100");
        assert x =false:"X!=false";
        if (!x){
            System.out.println("assert open");
        }
        System.out.println("Test passed!");
        }
    }

