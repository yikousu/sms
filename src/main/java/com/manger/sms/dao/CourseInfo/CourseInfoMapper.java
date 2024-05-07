package com.manger.sms.dao.CourseInfo;

import com.manger.sms.domain.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 课程具体安排表
 **/
@Mapper
public interface CourseInfoMapper {

  //新增课程具体安排（周数等）
  void addCourseInfo(CourseInfo courseInfo);

  //修改课程具体安排（周数等）
  void updateCourseInfo(CourseInfo courseInfo);

  //删除课程具体安排
  void deleteInfo(@Param("id") String id);

  //获取课程信息详情
  CourseInfo getInfo(@Param("condition") Map<String, Object> condition);
}
