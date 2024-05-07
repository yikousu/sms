package com.manger.sms.service.Upload;

import com.manger.sms.domain.Upload;

import java.util.Map;

/**
 * 上传文件层
 **/
public interface UploadService {

  //上传头像
  void upload(Upload upload);

  //获取头像
  String getHeader(Map<String, Object> condition);
}
