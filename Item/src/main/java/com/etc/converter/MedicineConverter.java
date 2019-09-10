package com.etc.converter;

import com.etc.entity.Medicine;
import com.etc.vo.MedicineVO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MedicineConverter {
    public static Medicine converter(MedicineVO medicineVO)  {
        Medicine medicine=new Medicine();
        medicine.setMId(medicineVO.getId());
        medicine.setBid(medicineVO.getBid());
        medicine.setExpiryDate(medicineVO.getExpiry());
        if (!"".equals(medicineVO.getImg().getOriginalFilename())) {
            medicine.setMImg(medicineVO.getImg().getOriginalFilename());
        }
        medicine.setMDescript(medicineVO.getDescript());
        medicine.setMName(medicineVO.getName());
        medicine.setMQuantity(medicineVO.getQuantity());
        medicine.setNorms(medicineVO.getNorms());
        medicine.setPrice(medicineVO.getPrice());
        medicine.setMType(medicineVO.getType());

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

        try {
            medicine.setProductionDate( simpleDateFormat.parse(medicineVO.getProduce()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return medicine;

    }
}
