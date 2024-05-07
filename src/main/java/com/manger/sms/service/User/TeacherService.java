package com.manger.sms.service.User;

import com.manger.sms.dto.User;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 教师用户
 **/
public interface TeacherService {

  // 新增教师账号
  void addTeacher(User user);

  // 删除教师账号
  void delete(List<Integer> ids);

  //修改教师账号
  void update(User user);

  //获取教师账号信息列表
  PagingResult<User> getTeacherList(RowBounds rowBounds, Map<String, Object> condition);
}
