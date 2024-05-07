package com.manger.sms.dao.User;

import com.manger.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 *登陆用户层
 **/
@Mapper
public interface UserMapper {

  //根据学生用户、密码登陆
  User getStudentInfo(@Param("condition") Map<String, Object> condition);

  //根据老师用户、密码登陆
  User getTeacherInfo(@Param("condition") Map<String, Object> condition);

  //根据管理员用户、密码登陆
  User getAdminInfo(@Param("condition") Map<String, Object> condition);

  //修改密码
  void update(@Param("condition") Map<String, Object> condition);

  //查询是否与原密码相同
  Integer checkPasswordCount(@Param("condition") Map<String, Object> condition);

  // 获取默哀模式
  Integer getSilent();

  //获取默哀模式
  void setSilent(@Param("state") Integer state);
}
