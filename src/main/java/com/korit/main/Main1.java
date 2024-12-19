package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;
import com.korit.service.TestPrint;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
//
//        // 리터럴 값을 저장
//        int a = 10;
//        // 자료형마다 저장할 수 있는 크기 동일 X
//        System.out.println(a);
//
//        // 주소 저장
//        // 주소값을 저장할 수 있는 크기 동일
        TestPrint testPrint = null;

        ATestService aTestService = new ATestService();
        BTestService bTestService = new BTestService();

//        // 객체 생성 후 주소 출력
//        System.out.println(new ATestService());
//        System.out.println(new BTestService());
//        aTestService.print();
//        bTestService.print();

        Random random = new Random();
        int randomInt = random.nextInt(100);

        if(randomInt % 2 == 0){
            testPrint = aTestService;
        } else {
            testPrint = bTestService;
        }

        testPrint.print();

        // 구체화 될수록 다운캐스팅
        // 추상화 될수록 업캐스팅


    }
}
