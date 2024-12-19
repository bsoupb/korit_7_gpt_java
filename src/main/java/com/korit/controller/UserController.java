package com.korit.controller;

import com.korit.entity.User;
import com.korit.repository.UserRepository;
import com.korit.service.UserService;
import com.korit.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

// @AllArgsConstructor
@RequiredArgsConstructor        // 필수값
public class UserController {

    // @Setter
    //    private UserService userService;      // UserService 바꾸고 싶을 때
    private final UserService userService;      // final -> 초기화가 생성자에서 일어남(바뀌지 않을 경우)

//    public UserController(UserService userService) {        // 외부에서 의존성 주입(생성자 의존성 주입)
//        this.userService = userService;
//    }

    public void signIn() {
        UserRepository.getInstance();
    }

    public void signUp() {      // controller 가 service 를 의존한다
        String username = "test";
        String password = "1234";
        String email = "test@gmail.com";

        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();

        
        userService.add(user);
    }
    // 결합도 낮추기 -> 의존성 분리 UserServiceImpl userService 를 매개변수로 받기
}
