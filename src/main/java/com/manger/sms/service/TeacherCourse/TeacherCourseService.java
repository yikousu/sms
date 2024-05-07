package com.manger.sms.service.TeacherCourse;

import com.manger.sms.domain.TeacherCourse;

import java.util.List;
import java.util.Map;

/**
 *教师课程层
 **/
public interface TeacherCourseService {

  //新增
  void add(List<TeacherCourse> list);


  //删除
  void delete(List<Integer> ids);


  // 修改
  void update(TeacherCourse teacherCourse);


  //根据教师id获取教师课程信息
  List<TeacherCourse> getCourseListById(String id);

  // 根据教师id获取教师用户所管理的专业、班级、课程名等信息
  List<Map<String, Object>> getProfessionInfo(String teacherId);

  //管理员用户获取所有的班级和课程，渲染成下拉框选择
  List<Map<String, Object>> getProfessionInfoByAdmin();

  //课程表中获取课程详细信息
  TeacherCourse getCourseInfo(Map<String, Object> condition);
}
