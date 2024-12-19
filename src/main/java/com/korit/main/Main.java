package com.korit.main;

import com.korit.controller.UserController;
import com.korit.service.UserServiceImpl;
import com.korit.service.UserServiceImpl2;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImpl2 userService2 = new UserServiceImpl2();
        UserController userController = new UserController(userService);    // 생성이 될 때 대입
        userController.signUp();
        userController.signIn();
//        userController.setUserService(userService2);
        // 의존성 주입
        // 인터페이스 -> 추상화 -> 업캐스팅
    }
}
