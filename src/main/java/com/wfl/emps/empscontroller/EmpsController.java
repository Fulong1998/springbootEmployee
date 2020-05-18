package com.wfl.emps.empscontroller;

import com.wfl.emps.enity.Emps;
import com.wfl.emps.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpsController {
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/emp/getAll",method = RequestMethod.GET)
    public String getAll(Model model){
        List<Emps> all = empService.findAll();
        model.addAttribute("all", all);
        return "listEmp";
    }

    //添加页面展示
    @RequestMapping(value = "/emp/addPage",method = RequestMethod.GET)
    public String showAddPage(){
        return "addEmp";
    }

    @RequestMapping(value = "/emp/add", method = RequestMethod.POST)
    public String save(Emps emp){
        empService.save(emp);
        return "redirect:/emp/getAll";
    }

    @RequestMapping(value = "/emp/delete/{id}",method = RequestMethod.DELETE)
    public String del(@PathVariable("id") int id){
        empService.delete(id);
        return "redirect:/emp/getAll";
    }

    @RequestMapping(value = "/emp/update/{id}",method = RequestMethod.GET)
    public String findByIdInfo(@PathVariable("id") Integer id,Model model){
        Emps byId = empService.findById(id);
        model.addAttribute("byId", byId);
        return "updateEmp";
    }

    @RequestMapping(value = "/emp/update",method = RequestMethod.PUT)
    public String update(Emps emps){
        empService.update(emps);
        return "redirect:/emp/getAll";
    }
}
