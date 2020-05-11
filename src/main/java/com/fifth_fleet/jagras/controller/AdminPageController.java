package com.fifth_fleet.jagras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
    @GetMapping(value = "/admin")
    public String admin(){
        return "redirect:admin_wb_list";
    }
    @GetMapping(value =  "/admin_wb_list")
    public String listWb(){
        return "admin/listWb";
    }
}
