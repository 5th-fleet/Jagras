package com.fifth_fleet.jagras.service;

import com.fifth_fleet.jagras.dao.wbDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import  com.fifth_fleet.jagras.pojo.wb;

import java.util.List;

@Service
public class wbService {
    @Autowired
    com.fifth_fleet.jagras.dao.wbDAO wbDAO;
    public List<wb> list(){
        Sort  sort = new Sort(Sort.Direction.DESC,"id");
        return wbDAO.findAll(sort);
    }
}
