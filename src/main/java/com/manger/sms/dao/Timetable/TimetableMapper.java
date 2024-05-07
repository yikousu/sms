package com.manger.sms.dao.Timetable;

import com.manger.sms.dto.Timetable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 课程表层
 **/
@Mapper
public interface TimetableMapper {

  //新增课程表
  void add(Timetable timetable);


  //获取timetable课程表信息
  List<Timetable> getTimetable(@Param("condition") Map<String, Object> condition);


  //根据专业班级查看课程表数量（验证是否添加课程表）
  Integer checkCount(@Param("condition") Map<String, Object> condition);

  //删除 timetable表
  void deleteTimeTable(@Param("condition") Map<String, Object> condition);
}
