package com.etc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Tuihuo {
    private Integer returnId;
    private Integer orderId;
    private Date returnDate;
    private String returnReason;
    private String mName;
    private String userName;
    private Integer orderQuantity;
    private Double money;
}
