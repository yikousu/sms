package com.manger.sms.dao.WeekCourse;

import com.manger.sms.domain.WeekCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *课程表具体安排层
 **/
@Mapper
public interface WeekCourseMapper {

  //新增week表数据
  void add(WeekCourse weekCourse);

  //修改week表
  void update(WeekCourse weekCourse);

  //根据专业班级获取课程表信息
  List<WeekCourse> getWeekCourse(@Param("condition") Map<String, Object> condition);
}
