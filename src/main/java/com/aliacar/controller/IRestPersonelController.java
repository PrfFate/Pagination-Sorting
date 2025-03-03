package com.aliacar.controller;

import org.springframework.data.domain.Page;

import com.aliacar.model.Personel;

public interface IRestPersonelController {

    public Page<Personel> findAllPageable(int pageNumber,int pageSize);

}
