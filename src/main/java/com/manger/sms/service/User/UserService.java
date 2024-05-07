package com.manger.sms.service.User;

import com.manger.sms.dto.User;

import java.util.List;
import java.util.Map;

/**
 *登陆用户
 **/
public interface UserService {

  //根据用户、密码登陆
  User getStudentInfo(Map<String, Object> condition);

  //修改密码
  boolean update(Map<String, Object> condition);

  //获取树状数据
  List<Object> getTree();

  //获取token
  String getToken(User user, long time);

  //根据等级和id获取用户信息
  User findUser(Map<String, Object> condition);

  //获取默哀模式
  boolean getSilent();

  //修改默哀模式
  boolean setSilent(Integer state);
}
