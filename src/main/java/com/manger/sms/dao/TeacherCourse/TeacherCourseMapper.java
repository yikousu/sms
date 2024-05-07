package com.manger.sms.dao.TeacherCourse;

import com.manger.sms.domain.TeacherCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *教师课程层
 **/
@Mapper
public interface TeacherCourseMapper {

  //新增
  void add(TeacherCourse teacherCourse);


  //删除
  void delete(@Param("ids") List<Integer> ids);


  //修改
  void update(TeacherCourse teacherCourse);


  //根据教师id获取教师课程信息
  List<TeacherCourse> getCourseListById(@Param("id") String id);

  //获取教师id和专业获取班级、课程名
  List<TeacherCourse> getGradeInfoByMap(@Param("condition") Map<String, Object> condition);

  //根据专业、班级和课程名获取所授课的教师id
  String getTeacherId(@Param("condition") Map<String, Object> condition);

  //课程表中获取课程详细信息
  TeacherCourse getCourseInfo(@Param("condition") Map<String, Object> condition);
}
