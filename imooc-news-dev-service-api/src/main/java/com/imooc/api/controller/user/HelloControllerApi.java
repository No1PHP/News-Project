package com.imooc.api.controller.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhining
 * @description
 * @create 2021-10-25-10-28
 **/
@Api(value = "hello", tags = "hello!") //swagger
@RestController
public interface HelloControllerApi {

  @ApiOperation(value = "hello interface", notes = "hello interface", httpMethod = "GET")
  @GetMapping("/hello")
  public Object hello();
}
