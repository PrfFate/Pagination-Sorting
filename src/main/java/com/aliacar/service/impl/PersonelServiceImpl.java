package com.aliacar.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aliacar.dto.DtoDepartment;
import com.aliacar.dto.DtoPersonel;
import com.aliacar.model.Personel;
import com.aliacar.repository.PersonelRepository;
import com.aliacar.service.IPersonelService;

@Service
public class PersonelServiceImpl implements IPersonelService {

    @Autowired
    private PersonelRepository personelRepository;

    private Page<Personel> allPageable;

    @Override
    public Page<Personel> findAllPageable(Pageable pageable) {
        Page<Personel> page= personelRepository.findAllPageable(pageable);
        return page;
    }

    @Override
    public List<DtoPersonel> toDTOList(List<Personel> personelList) {
       
        List<DtoPersonel> dtoList=new ArrayList<>();
        
        for (Personel personel : personelList) {
            DtoPersonel dtoPersonel=new DtoPersonel();
            DtoDepartment dtoDepartment=new DtoDepartment();

            BeanUtils.copyProperties(personel,dtoPersonel);
            BeanUtils.copyProperties(personel.getDepartment(), dtoDepartment);

            dtoPersonel.setDepartment(dtoDepartment);

            dtoList.add(dtoPersonel);
        }
        return dtoList;
    }
    

    
}
