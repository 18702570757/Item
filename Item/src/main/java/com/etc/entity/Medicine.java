package com.etc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {
    private Integer mId;
    private String mName;
    private String mType;
    private String mDescript;
    private Date productionDate;
    private String expiryDate;
    private String norms;
    private String mImg;
    private Integer mQuantity;
    private Double bid;
    private Double price;
    private Integer gId;
}
