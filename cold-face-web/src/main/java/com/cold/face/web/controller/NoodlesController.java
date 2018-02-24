package com.cold.face.web.controller;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ylj on 18-2-23.
 */
@RestController
@RequestMapping("noodles")
@Api(description = "面条")
@Validated
public class NoodlesController {
}
