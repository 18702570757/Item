package com.etc.controller;

import com.etc.common.Constant;
import com.etc.entity.Tuihuo;
import com.etc.service.TuihuoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("tuihuo")
public class TuihuoController {
    @Autowired
    private TuihuoService tuihuoService;
    @RequestMapping("select")
    public String select(Integer pageNum, Model model){
        if (pageNum==null){
            pageNum=1;
        }
        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);
        List<Tuihuo> tuihuos=tuihuoService.select();
        PageInfo<Tuihuo> pageInfo=new PageInfo<>(tuihuos);
        for (Tuihuo list:tuihuos){
            System.out.println(list);
        }
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("tuihuos",tuihuos);
        return "tuihuo-list";

    }
   @RequestMapping("delete")
    public String delete(int id){
        tuihuoService.delete(id);
        return "redirect:select";
   }
   @RequestMapping("search")
    public String search(@ModelAttribute("name") String name,Integer pageNum,Model model){
        if (pageNum==null){
            pageNum=1;
        }
        Tuihuo tuihuo=new Tuihuo();
        PageHelper.startPage(pageNum,Constant.PAGE_SIZE);
        tuihuo.setMName(name);
        List<Tuihuo> tuihuos=tuihuoService.search(tuihuo);
        PageInfo<Tuihuo> pageInfo=new PageInfo<>(tuihuos);
        for (Tuihuo list:tuihuos){
            System.out.println(list);
        }
        model.addAttribute("pageInfo",pageInfo);
        return "tuihuo-list";
   }

}
