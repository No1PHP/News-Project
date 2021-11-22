package com.imooc.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Zhining
 * @description
 * @create 2021-11-03-16-10
 **/
@Component
@PropertySource("classpath:aws.properties")
@ConfigurationProperties(prefix = "aws")
public class AWSResource {
  private String accessKeyID;
  private String accessKeySecret;

  public String getAccessKeyID() {
    return accessKeyID;
  }

  public void setAccessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
  }

  public String getAccessKeySecret() {
    return accessKeySecret;
  }

  public void setAccessKeySecret(String accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }
}
