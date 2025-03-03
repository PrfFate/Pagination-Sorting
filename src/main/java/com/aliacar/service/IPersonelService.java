package com.aliacar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aliacar.model.Personel;

public interface IPersonelService {

    Page<Personel> findAllPageable(Pageable pageable);

}
