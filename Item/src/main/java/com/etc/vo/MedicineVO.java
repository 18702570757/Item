package com.etc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineVO {
    private Integer id;
    private String name;
    private String type;
    private String descript;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String produce;
    private String expiry;
    private String norms;
    private Integer quantity;
    private Double bid;
    private Double price;
    private MultipartFile img;
}
