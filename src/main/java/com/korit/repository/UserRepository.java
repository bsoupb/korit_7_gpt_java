package com.korit.repository;

import com.korit.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static UserRepository instance;     // * private static  필드
    private List<User> userList;

    private UserRepository() {  // 싱글톤: 외부에서 생성되면 안됨    // * private 생성자
        userList = new ArrayList<>();
    }

    public static UserRepository getInstance() {    //* static getter
        if(instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public void addUser(User user){
        userList.add(user);
    }

}
