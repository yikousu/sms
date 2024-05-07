package com.manger.sms.dao.Upload;

import com.manger.sms.domain.Upload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Description 上传
 * Author: zjh
 * Date2020/4/29 12:47
 **/
@Mapper
public interface UploadMapper {

  //上传头像
  void add(Upload upload);

  //获取头像
  String getHead(@Param("condition") Map<String, Object> condition);

  //根据用户id和等级查询用户是否存在
  Integer checkCount(@Param("condition") Map<String, Object> condition);

  //修改用户头像
  void update(Upload upload);
}
