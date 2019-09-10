package com.etc.dao;

import com.etc.entity.Order;

import java.util.List;

public interface OrderDAO {
    List<Order>  query();
    void delete(int id);
    List<Order> search(Order order);

}
