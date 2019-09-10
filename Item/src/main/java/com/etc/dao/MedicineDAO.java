package com.etc.dao;

import com.etc.entity.Medicine;

import java.util.List;

public interface MedicineDAO {
    void add(Medicine medicine);
    List<Medicine> selectall();
    void delete(int id);
    Medicine selectById(int id);
    void update(Medicine medicine);
    List<Medicine> selectByName(Medicine medicine);

}
