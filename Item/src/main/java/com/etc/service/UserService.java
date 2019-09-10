package com.etc.service;

import com.etc.converter.UserConverter;
import com.etc.dao.UserDAO;
import com.etc.entity.User;
import com.etc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
   private UserDAO userDAO;
    public User login(String name, String password){

        return userDAO.login(name,password);
    }
    public List<User> all(){
        return userDAO.all();
    }
    public void add(UserVO userVO){
        User user= UserConverter.converter(userVO);
        user.setUserImg(userVO.getImg().getOriginalFilename());
        userDAO.add(user);
    }
    public void delete(int id){
        userDAO.delete(id);

    }

    /**
     * 根据用户userid查询用户信息进行修改信息
     * @param id
     * @return
     */
    public User update(int id){

        return userDAO.update(id);
    }
    public void toupdate(User user){

        userDAO.toupdate(user);
    }
    public List<User> search(User user){
        return userDAO.search(user);
    }
}
