package com.manger.sms.service.User;

import com.manger.sms.dto.User;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * 管理员层
 **/
public interface AdminService {

  //新增学生账号
  void add(User user);


  //删除学生账号
  void delete(List<Integer> ids);


  //修改学生账号
  void update(User user);


  //获取学生账号信息列表
  PagingResult<User> getAdminList(RowBounds rowBounds, Map<String, Object> condition);
}
