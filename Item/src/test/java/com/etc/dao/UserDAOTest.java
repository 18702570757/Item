package com.etc.dao;

import com.etc.BaseTest;
import com.etc.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDAOTest extends BaseTest {
    @Autowired
    private UserDAO userDAO;
    @Test
    public void testAll(){
       List<User> list= userDAO.all();
       for (User users:list){
           System.out.println(users);
       }

    }
//    @Test
//    public void testUpdate(){
//        User user=new User();
//        user.setUserId(2);
//        System.out.println(user.getUserId());
//        user.setUserName("lisi");
//        user.setUserPass("1234");
//        user.setUserNum("123232");
//        user.setUserTel("111111");
//        user.setUserGrade(1);
//        user.setSex("0");
//        user.setAge(22);
//
//        userDAO.toupdate(user);
//        System.out.println(user);
//
//
//    }
//    @Test
//    public void testSearch() {
//        User user = new User();
//        user.setUserName("a");
//        List<User> users = userDAO.search(user);
//        for (User list : users) {
//            System.out.println(user);
//        }
//    }
}
