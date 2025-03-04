package com.aliacar.controller.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aliacar.utils.PagerUtil;
import com.aliacar.utils.RestPageableEntity;
import com.aliacar.utils.RestPageableRequest;
import com.aliacar.utils.RestRootEntity;

public class RestBaseController  {

    public Pageable toPageable(RestPageableRequest request){
       return PagerUtil.toPageable(request);

    }

    public <T> RestPageableEntity<T> toPageableResponse(Page<?> page,List<T> content){
        return PagerUtil.toPageableResponse(page, content);
    }

    public <T> RestRootEntity<T> ok(T payload){
        return RestRootEntity.ok(payload);

    }
}
