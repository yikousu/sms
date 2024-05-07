package com.manger.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.manger.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 管理员账号Mapper层
 **/
@Mapper
public interface AdminMapper {
   // 新增管理员账号信息
  void add(User user);

   // 删除管理员账号

  void delete(@Param("ids") List<Integer> ids);

  //修改管理员账号
  void update(User user);

  //获取管理员账号信息列表
  List<User> getAdminList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);

  //根据管理员id获取管理员信息
  User getUserById(@Param("id") String id);

  //查看管理员人数
  Integer checkCodeCount();
}
