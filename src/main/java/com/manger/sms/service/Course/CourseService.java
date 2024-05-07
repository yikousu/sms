package com.manger.sms.service.Course;

import com.manger.sms.dto.Course;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 课程信息service层
 **/
public interface CourseService {

  //新增课程信息
  void addCourse(Course course);

  // 删除课程信息
  void delete(List<Integer> ids);


  //修改课程信息
  void update(Course course);

  //查询课程信息
  PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);

  //根据专业、学期获取课程列表
  List<Course> getCourseByMap(Map<String, Object> condition);
}

