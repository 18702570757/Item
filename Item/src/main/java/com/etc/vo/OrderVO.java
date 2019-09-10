package com.etc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO {
    private Integer id;
   private String username;
    private String medicinename;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private String datetime;
    private Integer quantity;
    private Double totalmoney;
    private String state;
    private String no;

}
