package com.aliacar.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aliacar.dto.DtoPersonel;
import com.aliacar.model.Personel;

public interface IPersonelService {

    Page<Personel> findAllPageable(Pageable pageable);

    List<DtoPersonel> toDTOList(List<Personel> personelList);

}
