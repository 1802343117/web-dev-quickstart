package com.bo.service;


import com.bo.entity.User;
import com.bo.utils.Md5Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mq_xu
 * @ClassName UserService
 * @Description 用户业务逻辑类
 * @Date 2019/9/26
 * @Version 1.0
 **/
public class UserService {
    private List<User> userList;

    public UserService() {
        init();
    }
//
//    /**
//     * 用户数据初始化方法
//     * @return List<User>
//     */
    public List<User> init() {
        userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "开到荼蘼", "user1.jpg", "江苏南京", LocalDate.of(2018, 6, 11)),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "小幸运", "user2.jpg", "浙江杭州", LocalDate.of(2019, 2, 18)),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "往后余生", "user3.jpg", "湖北武汉", LocalDate.of(2019, 8, 19))
        };
        userList = Arrays.asList(users);
        return userList;
    }

//    /**
//     * 用户登陆功能
//     * @param account
//     * @param password
//     * @return user
//     */
    public User signIn(String account, String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(Md5Util.crypt(password))) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        User user = new UserService().signIn("13951905171", Md5Util.crypt("111"));
//        if (user != null) {
//            System.out.println(user);
//        } else {
//            System.out.println("登录失败");
//        }
    }
}
