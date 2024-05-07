package com.manger.sms.service.Timetable;

import com.manger.sms.domain.CourseInfo;
import com.manger.sms.domain.WeekCourse;

import java.util.List;
import java.util.Map;

/**
 *课程表层
 **/
public interface TimetableService {

  //新增课程表
  void add(List<WeekCourse> list);


  //管理员用户获取课程表
  List<WeekCourse> getTimetable(Map<String, Object> condition);

  //学生用户获取课程表
  List<WeekCourse> getTimetableByStudent(Map<String, Object> condition);

  //教师用户获取课程表
  List<WeekCourse> getTimetableByTeacher(Map<String, Object> condition);

  //新增课程具体安排（周数等）
  void updateCourseInfo(CourseInfo courseInfo);
}
