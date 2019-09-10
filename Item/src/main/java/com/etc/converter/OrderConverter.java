package com.etc.converter;

import com.etc.entity.Order;
import com.etc.vo.OrderVO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OrderConverter {
    public static Order converter(OrderVO orderVO){
        Order order=new Order();
        order.setOrderId(orderVO.getId());
        //order.setUserName(orderVO.getUsername());
        order.setOrderAddress(orderVO.getAddress());
        order.setTotal(orderVO.getTotalmoney());
        order.setOrderState(orderVO.getState());
       order.setOrderNo(orderVO.getNo());
       order.setMedicineName(orderVO.getMedicinename());
       order.setOrderQuantity(orderVO.getQuantity());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            order.setOrderDate(simpleDateFormat.parse(orderVO.getDatetime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return order;
    }
}
