package com.imooc.api.controller.user;

import com.imooc.grace.result.GraceJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "registration_login", tags = "registration controller") //swagger
@RestController
public interface PassportControllerApi {
  @ApiOperation(value = "acquireSMS", notes = "SMS verification code", httpMethod = "GET")
  @GetMapping("/getSMSCode")
  public GraceJSONResult getSMSCode() throws Exception;
}
