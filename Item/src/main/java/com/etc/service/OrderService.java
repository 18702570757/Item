package com.etc.service;

import com.etc.dao.OrderDAO;
import com.etc.entity.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderDAO orderDAO;
    public List<Order> query(){

        return orderDAO.query();
    }
    public void delete(int id){
        orderDAO.delete(id);
    }
    public List<Order> search(Order order){
        return orderDAO.search(order);
    }
}
