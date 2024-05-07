package com.manger.sms.service.User;

import com.manger.sms.dto.User;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 *学生账号
 **/
public interface StudentService {

  //新增学生账号
  void addStudent(User user);


  //删除学生账号
  void delete(List<String> ids);


  //修改学生账号
  void update(User user);

  //获取学生账号信息列表
  PagingResult<User> getStudentList(RowBounds rowBounds, Map<String, Object> condition);
}
