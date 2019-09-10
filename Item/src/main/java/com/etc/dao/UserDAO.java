package com.etc.dao;

import com.etc.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    User login(@Param("name") String name,@Param("password") String password);
    List<User> all();
    void add(User user);
    void delete(int id);
    User update(int id);
    void toupdate(User user);
    List<User> search(User user);


}
