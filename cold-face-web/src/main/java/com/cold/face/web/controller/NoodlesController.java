package com.cold.face.web.controller;

import dto.NoodlesResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import service.NoodlesService;

import java.awt.*;
import java.util.List;

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

    @GetMapping("{userName}/{appCode}/getNoodlesType")
    @ApiOperation(value = "获取Noodles类型")
    public NoodlesResponseDTO getNoodlesType(@PathVariable String userName, @PathVariable String appCode) throws Exception {
        return noodlesService.getNoodlesType(userName, appCode);
    }
}
