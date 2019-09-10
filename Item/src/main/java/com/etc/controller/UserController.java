package com.etc.controller;

import com.etc.common.Constant;
import com.etc.converter.UserConverter;
import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.vo.UserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("/images")
    public String images(String imgName, HttpServletResponse response) throws IOException {
        IOUtils.copy(new FileInputStream(UPLOAD_DIR+imgName),response.getOutputStream());
        return null;
    }

    public static final String UPLOAD_DIR="D:\\images\\";
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @return
     */
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("dologin")
    public String dologin(String name, String password){
        User user=userService.login(name,password);
        System.out.println(user);
        if (user==null){
            System.out.println("fail");
            return "login";
        }
        System.out.println("success");

        return "redirect:../index.jsp";
    }

    /**
     * 查询显示所有用户信息
     * @param pageNum
     * @param model
     * @return
     */
    @RequestMapping("alluser")
    public String all(Integer pageNum,Model model){
        if (pageNum == null) {
            pageNum = 1;
        }

        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);
        List<User> user=userService.all();
        PageInfo<User> pageInfo = new PageInfo<>(user);
        for(User list:user){
            System.out.println(list);
            System.out.println("--------");
        }
        model.addAttribute("pageInfo",pageInfo);

        model.addAttribute("user",user);
        return "user-list";
    }

    /**
     * 后台添加用户
     * @param userVO
     *
     */
    @RequestMapping("add")
    public String add(UserVO userVO){
        userService.add(userVO);
        return "redirect:alluser";
    }

    /**
     * 后台删除用户
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(int id){
        userService.delete(id);
        return "redirect:alluser";

    }

    /**
     * 将用户的信息全部在user-update.jsp页面显示出来
     * @param userVO
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("update")
    public String update( UserVO userVO, int id, HttpSession session){
        User user=userService.update(id);
        session.setAttribute("user1",user);
        return "user-update";

    }

    /**
     * 后台修改用户信息
     * @param userVO
     * @param session
     * @return
     */
    @RequestMapping("doupdate")
    public String toupdate(@ModelAttribute("userVO") UserVO userVO,HttpSession session){
        User user= UserConverter.converter(userVO);
       if (!"".equals(userVO.getImg().getOriginalFilename())) {
           user.setUserImg(userVO.getImg().getOriginalFilename());

       }
        userService.toupdate(user);
        System.out.println("image:"+user.getUserImg());
        session.setAttribute("user1",user);
        System.out.println(user);
        return "redirect:/user/alluser";
    }


    @RequestMapping("search")
    public String search(@ModelAttribute("name") String name, Integer pageNum,Model model){
        if (pageNum == null) {
            pageNum = 1;
        }
        User user=new User();
        user.setUserName(name);
        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);
        List<User> user1=userService.search(user);
        PageInfo<User> pageInfo = new PageInfo<>(user1);
        for(User list:user1){
            System.out.println(list);
        }
        model.addAttribute("pageInfo",pageInfo);
        return "user-list";
    }

}
