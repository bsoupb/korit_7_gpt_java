package com.korit.service;

public class ATestService implements TestPrint{
    
    // @Override 생략 가능
    public void print() {
        System.out.println("ATestService 출력");
    }
}
