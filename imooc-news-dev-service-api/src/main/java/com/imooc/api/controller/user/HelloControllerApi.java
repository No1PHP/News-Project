package com.imooc.api.controller.user;

import com.imooc.grace.result.GraceJSONResult;
import com.imooc.utils.RedisOperator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "hello", tags = "hello!") //swagger
@RestController
public interface HelloControllerApi {

  @ApiOperation(value = "hello interface", notes = "hello interface", httpMethod = "GET")
  @GetMapping("/hello")
  public Object hello();
}
