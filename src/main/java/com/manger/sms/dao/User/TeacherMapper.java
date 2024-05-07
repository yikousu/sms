package com.manger.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.manger.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *教师用户层
 **/
@Mapper
public interface TeacherMapper {


  //新增教师账号信息
  void addTeacher(User user);

  // 删除教师账号
  void delete(@Param("ids") List<Integer> ids);


  //修改教师账号
  void update(User user);


  //获取教师账号信息列表
  List<User> getTeacherList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);

  //通过id获取
  User getUserById(@Param("id") String id);

  //查看人数
  Integer checkCodeCount();
}
