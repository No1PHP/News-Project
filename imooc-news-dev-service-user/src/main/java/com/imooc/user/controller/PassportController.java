package com.imooc.user.controller;

import com.imooc.api.controller.user.PassportControllerApi;
import com.imooc.grace.result.GraceJSONResult;
import com.imooc.utils.RedisOperator;
import com.imooc.utils.SMSUtils;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PassportController implements PassportControllerApi {
  final static Logger logger = LoggerFactory.getLogger(PassportController.class);



  @Autowired
  private SMSUtils smsUtils;

  @Override
  public GraceJSONResult getSMSCode() throws Exception {
    String random = "123456";
    smsUtils.sendSMS(random, "19815151534");
    return null;
  }
}
