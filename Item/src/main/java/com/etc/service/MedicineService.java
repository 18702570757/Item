package com.etc.service;

import com.etc.converter.MedicineConverter;
import com.etc.dao.MedicineDAO;
import com.etc.entity.Medicine;

import com.etc.vo.MedicineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class MedicineService {
    @Autowired
    private MedicineDAO medicineDAO;
    public void add(MedicineVO medicineVO){
        Medicine medicine= MedicineConverter.converter(medicineVO);
        medicineDAO.add(medicine);
    }
    public List<Medicine> selectall(){
        return medicineDAO.selectall();
    }
    public void delete(int id){
        medicineDAO.delete(id);
    }
    public Medicine selectById(int id){
        return medicineDAO.selectById(id);
    }
    public void update(Medicine medicine){

        medicineDAO.update(medicine);
    }
    public List<Medicine> selectByName(Medicine medicine){
        return medicineDAO.selectByName(medicine);

    }

}
