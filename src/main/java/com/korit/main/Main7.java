package com.korit.main;
// thread
// 웹서버 -> thread
public class Main7 {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {     // 익명
                for(int i = 0; i < 100; i++) {
                    try {       // 프로그램 강제 처리X, 대안
                        System.out.println("첫번째 반복문 i: " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("프로그램에 오류가 발생함");
                    }
                }
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Runnable runnable2 = () -> {
            for(int i = 0; i < 100; i++) {
                try {
                    System.out.println("첫번째 반복문 i: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("프로그램에 오류가 발생함");
                }

            }
        };  // 매개변수 X 리턴값 X

        Thread t2 = new Thread(runnable2);
        t2.start();

        for(int i = 0; i < 100; i++) {
            System.out.println("MAIN Thread i: " + i);
            Thread.sleep(1000);

        }

    }
}
