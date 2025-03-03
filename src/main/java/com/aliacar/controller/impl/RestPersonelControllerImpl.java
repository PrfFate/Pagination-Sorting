package com.aliacar.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aliacar.controller.IRestPersonelController;
import com.aliacar.model.Personel;
import com.aliacar.service.IPersonelService;


@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl implements IRestPersonelController {

    @Autowired
    private IPersonelService  personelService;

    @GetMapping("/list/pageable")
    @Override
    public Page<Personel> findAllPageable(@RequestParam(value = "pageNumber")int pageNumber,
                                          @RequestParam(value = "pageSize") int pageSize){
           PageRequest pageable = PageRequest.of(pageNumber, pageSize);
           return personelService.findAllPageable(pageable);                            
        
    }

    
    
}
