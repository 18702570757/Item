package com.etc.dao;

import com.etc.entity.Tuihuo;

import java.util.List;

public interface TuihuoDAO {
    List<Tuihuo> select();
    void delete(int id);
    List<Tuihuo> search(Tuihuo tuihuo);
}
