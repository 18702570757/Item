package com.etc.controller;

import com.etc.common.Constant;
import com.etc.converter.MedicineConverter;
import com.etc.entity.Medicine;
import com.etc.service.MedicineService;
import com.etc.vo.MedicineVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("medicine")
public class MedicineController {
    @RequestMapping("/images")
    public String images(String imgName, HttpServletResponse response) throws IOException {
        IOUtils.copy(new FileInputStream(UPLOAD_DIR+imgName),response.getOutputStream());
        return null;
    }

    public static final String UPLOAD_DIR="D:\\images\\";
    @Autowired
    private MedicineService medicineService;

    /**
     * 增加药品信息
     * @param medicineVO
     * @return
     */
    @RequestMapping("add")
    public String add(MedicineVO medicineVO){
        medicineService.add(medicineVO);
        return "redirect:selectall";
    }

    /**
     * 查询所有药品信息
     * @param pageNum
     * @param model
     * @return
     */
    @RequestMapping("selectall")
    public String selectall(Integer pageNum, Model model){
        if (pageNum == null) {
            pageNum = 1;
        }

        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);
        List<Medicine> medicines =medicineService.selectall();
        PageInfo<Medicine> pageInfo=new PageInfo<>(medicines);
        for (Medicine list:medicines){
            System.out.println(list);
        }
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("medicines",medicines);
        return "medicine-list";
    }

    /**
     * 根据id删除药品
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(int id){
        medicineService.delete(id);
        return "redirect:selectall";
    }

    /**
     * 根据用户id查询某个药品信息
     * @param id
     * @param
     * @return
     */
    @RequestMapping("update")
    public String selectById(int id,Model model){
        Medicine medicine=medicineService.selectById(id);
      model.addAttribute("m",medicine);
        return "medicine-update";

    }

    /**
     * 修改药品信息
     * @param medicineVO
     * @param model
     * @return
     */
    @RequestMapping("doupdate")
    public String update(@ModelAttribute("medicineVO") MedicineVO medicineVO,Model model){
        Medicine medicine= MedicineConverter.converter(medicineVO);
        System.out.println(medicine);
        medicineService.update(medicine);
        System.out.println(medicine);
        model.addAttribute("m",medicine);
        return "redirect:selectall";
    }
    @RequestMapping("search")
    public String seletcByName(@ModelAttribute("name") String name,Integer pageNum,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        Medicine medicine=new Medicine();
        medicine.setMName(name);
        PageHelper.startPage(pageNum,Constant.PAGE_SIZE);
        System.out.println("-----------------");
        System.out.println(medicine);
        List<Medicine> medicines=medicineService.selectByName(medicine);
        System.out.println(medicines);
        PageInfo<Medicine> pageInfo=new PageInfo<>(medicines);
        for (Medicine list:medicines){
            System.out.println(list);
        }
        model.addAttribute("pageInfo",pageInfo);
        return "medicine-list";
    }


}
