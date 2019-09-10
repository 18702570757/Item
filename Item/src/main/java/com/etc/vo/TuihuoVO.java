package com.etc.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TuihuoVO {
    private Integer id;
    private Integer oId;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private String date;
    private String reason;
    private String medicine;
    private String username;
    private Integer quantity;
    private Double totalmoney;
}