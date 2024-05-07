package com.manger.sms.dao.Profession;

import com.manger.sms.domain.Profession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 专业信息
 **/
@Mapper
public interface ProfessionMapper {

  //获取所有专业
  List<Profession> getProfessionList();

  // 根据专业名查询专业数量（判断是否存在该专业）
  Integer checkProfessionCount(@Param("name") String name);

  //新增专业
  void addProfession(Profession profession);

  //删除专业
  void deleteProfession(@Param("id") Integer id);

  //根据专业名查询专业信息
  Profession getProfessionIdByName(@Param("name") String name);
}
