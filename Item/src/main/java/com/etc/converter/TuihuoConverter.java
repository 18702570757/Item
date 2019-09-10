package com.etc.converter;

import com.etc.entity.Tuihuo;
import com.etc.vo.TuihuoVO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TuihuoConverter {
    public static Tuihuo converter(TuihuoVO tuihuoVO){
        Tuihuo tuihuo=new Tuihuo();
        tuihuo.setReturnId(tuihuoVO.getId());
        tuihuo.setOrderId(tuihuoVO.getOId());
        tuihuo.setMName(tuihuoVO.getMedicine());
        tuihuo.setMoney(tuihuoVO.getTotalmoney());
        tuihuo.setUserName(tuihuoVO.getUsername());
        tuihuo.setOrderQuantity(tuihuoVO.getQuantity());
        tuihuo.setReturnReason(tuihuoVO.getReason());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            tuihuo.setReturnDate(simpleDateFormat.parse(tuihuoVO.getDate()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return tuihuo;
    }
}
