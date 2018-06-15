package com.cold.face.web.controller;

import dto.NoodlesResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.NoodlesService;


/**
 * Created by ylj on 18-2-23.
 */
@RestController
@RequestMapping(value = "noodles", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(description = "面条")
@Validated
public class NoodlesController {

    @Autowired
    NoodlesService noodlesService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("{userName}/{appCode}/getNoodlesType")
    @ApiOperation(value = "获取Noodles类型")
    public NoodlesResponseDTO getNoodlesType(@PathVariable String userName, @PathVariable String appCode) throws Exception {
        logger.info("aaaaaaaaaaaaaa");
        return noodlesService.getNoodlesType(userName, appCode);
    }
}
