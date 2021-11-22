package com.imooc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.aliyun.tea.*;
import com.aliyun.dysmsapi20170525.*;
import com.aliyun.dysmsapi20170525.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
/**
 * @author Zhining
 * @description
 * @create 2021-11-03-16-57
 **/
@Component
public class SMSUtils {

  @Autowired
  public AliyunResource aliyunResource;

  public static final String ACCESS_KEY_ID = "LTAI5tD8ithaHjMFae37ZPWg";

  public static final String ACCESS_KEY_SECRET = "nrf7kOxEUicupjlWdQ126RlzogbOD2";

  public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
    Config config = new Config()
        // 您的AccessKey ID
        .setAccessKeyId(accessKeyId)
        // 您的AccessKey Secret
        .setAccessKeySecret(accessKeySecret);
    // 访问的域名
    config.endpoint = "dysmsapi.ap-southeast-1.aliyuncs.com";
    return new com.aliyun.dysmsapi20170525.Client(config);
  }

  public void sendSMS() throws Exception {
    com.aliyun.dysmsapi20170525.Client client = SMSUtils.createClient(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
    SendSmsRequest sendSmsRequest = new SendSmsRequest();
    client.sendSms(sendSmsRequest);
  }

}
