package com.imooc.user.controller;

import com.imooc.api.controller.user.HelloControllerApi;
import com.imooc.grace.result.GraceJSONResult;
import com.imooc.grace.result.IMOOCJSONResult;
import com.imooc.utils.RedisOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhining
 * @description
 * @create 2021-10-25-01-31
 **/
@RestController
public class HelloController implements HelloControllerApi {

  final static Logger logger = LoggerFactory.getLogger(HelloController.class);


  @Autowired
  private RedisOperator redisOperator;


  @GetMapping("/helloredis")
  public Object redis(){
    redisOperator.set("age", "20");
    return GraceJSONResult.ok(redisOperator.get("age"));
  }


  public Object hello(){
    logger.debug("hello");
    logger.info("hello");
    logger.warn("hello");
    logger.error("hello");
    return GraceJSONResult.ok();
  }
}
