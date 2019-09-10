package com.etc.dao;

import com.etc.BaseTest;
import com.etc.entity.Medicine;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.List;

public class MedicineDAOTest extends BaseTest {
    @Autowired
    private MedicineDAO medicineDAO;
    /*@Test
    public void testupdate(){
        Medicine medicine=new Medicine();
        medicine.setMId(2);

        medicine.setMType("haha");
        medicine.setPrice(12.0);
        medicine.setBid(10.0);
        medicine.setNorms("12");
        medicine.setMQuantity(123);
        medicine.setMName("kkkk");
        medicine.setExpiryDate("6");
        medicine.setMDescript("sadsad");
        medicineDAO.update(medicine);
    }*/


}
