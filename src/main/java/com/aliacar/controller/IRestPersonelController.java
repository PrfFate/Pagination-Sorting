package com.aliacar.controller;



import com.aliacar.dto.DtoPersonel;

import com.aliacar.utils.RestPageableEntity;
import com.aliacar.utils.RestPageableRequest;
import com.aliacar.utils.RestRootEntity;

public interface IRestPersonelController {

    public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(RestPageableRequest pageableRequest);

}
