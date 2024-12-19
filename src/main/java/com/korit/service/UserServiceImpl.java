package com.korit.service;

import com.korit.entity.User;
import com.korit.repository.UserRepository;

public class UserServiceImpl implements UserService {
    @Override
    public void add(User user) {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.addUser(user);
        // userRepository: 싱글톤 -> 의존성 주입 필요 X
    }

    @Override
    public void remove() {

    }

    @Override
    public void printInfo() {

    }
}

// service가 repository 의존