package com.etc.service;

import com.etc.dao.TuihuoDAO;
import com.etc.entity.Tuihuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuihuoService {
    @Autowired
    private TuihuoDAO tuihuoDAO;
    public List<Tuihuo> select(){
        return tuihuoDAO.select();
    }
    public void delete(int id){
        tuihuoDAO.delete(id);
    }
    public List<Tuihuo> search(Tuihuo tuihuo){
        return tuihuoDAO.search(tuihuo);
    }
}
