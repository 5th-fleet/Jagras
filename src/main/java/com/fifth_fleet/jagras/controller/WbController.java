package com.fifth_fleet.jagras.controller;

import com.fifth_fleet.jagras.pojo.wb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WbController {
    @Autowired
    com.fifth_fleet.jagras.service.wbService wbService;

    @GetMapping("/wbs")
    public List<wb> list() throws Exception{
        return wbService.list();
    }
}
