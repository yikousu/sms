package com.manger.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.manger.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *学生用户层
 **/
@Mapper
public interface StudentMapper {

  // 新增学生账号信息
  void addStudent(User user);


  //删除学生账号
  void delete(@Param("ids") List<String> ids);


  //修改学生账号
  void update(User user);


  //获取学生账号信息列表
  List<User> getStudentList(PageRowBounds rowBounds,  @Param("condition") Map<String, Object> condition);

  List<User> getStudentTree();

  // 根据专业获取该专业下的所有班级
  List<String> getGradeByProfession(@Param("code") String code);

  //查看人数
  Integer checkCodeCount(@Param("condition") Map<String, Object> condition);

  //根据id获取管理员信息
  User getUserById(@Param("id") String id);

  //根据id获取学生信息
  User getStudentById(@Param("id") String id);
}
