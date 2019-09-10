package com.etc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
//    private Integer orderId;
//    private Integer userId;
//    private String mName;
//    private String oAddress;
//    private Date orderDate;
//    private Integer orderQuantity;
//    private Double money;
//    private String orderState;
   private String userName;
    private Integer orderId;
    private Integer userId;
    private String medicineName;
    private String orderNo;
    private String orderAddress;
    private Date orderDate;
    private Integer orderQuantity;
    private Double total;
    private String orderState;



}
