package com.aliacar.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliacar.controller.IRestPersonelController;
import com.aliacar.dto.DtoPersonel;
import com.aliacar.model.Personel;
import com.aliacar.service.IPersonelService;
import com.aliacar.utils.RestPageableEntity;
import com.aliacar.utils.RestPageableRequest;
import com.aliacar.utils.RestRootEntity;


@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController {

    @Autowired
    private IPersonelService  personelService;

    

    @GetMapping("/list/pageable")
    @Override
    public  RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(@ModelAttribute RestPageableRequest pageable){
           Pageable pageableRequest=toPageable(pageable);
           Page<Personel> page= personelService.findAllPageable(pageableRequest);                            
           RestPageableEntity<DtoPersonel> pageableResponse= toPageableResponse(page,personelService.toDTOList(page.getContent()));
           return ok(pageableResponse);
        }

    
    
}
