package com.aliacar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

    
}
