package com.etc.controller;

import com.etc.common.Constant;
import com.etc.entity.Medicine;
import com.etc.entity.Order;

import com.etc.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("select")
    public String query(Integer pageNum, Model model){
        if (pageNum==null){
            pageNum=1;
        }
        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);
        List<Order> order=orderService.query();
        PageInfo<Order> pageInfo=new PageInfo<>(order);
        for (Order list:order){
            System.out.println(list);
        }
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("order",order);

        return "order-list";
    }
    @RequestMapping("delete")
    public String delete(int id){
        orderService.delete(id);
        return "redirect:select";
    }
    @RequestMapping("search")
    public String search(@ModelAttribute("name") String name, Integer pageNum, Model model){
        if (pageNum==null){
            pageNum=1;
        }
        Order order=new Order();
        order.setMedicineName(name);
        PageHelper.startPage(pageNum,Constant.PAGE_SIZE);
       List<Order> orders= orderService.search(order);
       PageInfo<Order> pageInfo=new PageInfo<>(orders);
       for (Order list:orders){
           System.out.println(list);
       }
       model.addAttribute("pageInfo",pageInfo);
       return "order-list";

    }

}
