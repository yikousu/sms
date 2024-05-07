package com.manger.sms.dao.Score;

import com.github.pagehelper.PageRowBounds;
import com.manger.sms.dto.Course;
import com.manger.sms.dto.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *分数信息层
 **/
@Mapper
public interface ScoreMapper {

  //教师用户根据专业等获取课程信息
  List<Course> getCourseByMap(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);

  //管理员用户根据专业、班级查询所有分数信息
  List<Course> getCourseByAdmin(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);

  //学生用户根据学生id获取所有分数信息
  List<Course> getCourseByStudent(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);

  //根据学生id和课程名获取分数信息
  Course getScoreById(@Param("condition") Map<String, Object> condition);

  //录入成绩
  void addEntry(Score score);

  //修改成绩
  void updateEntry(Score score);

  //查看是否录入成绩
  Integer checkCount(@Param("condition") Map<String, Object> condition);

  //教师用户获取导出成绩列表
  List<Course> getExportList(@Param("condition") Map<String, Object> condition);

  //管理员用户获取导出成绩列表
  List<Course> getExportListByAdmin(@Param("condition") Map<String, Object> condition);

  //学生用户获取导出成绩列表
  List<Course> getExportListByStudent(@Param("condition") Map<String, Object> condition);

  //根据学生id获取所有课程的绩点和学分
  List<Course> getStudentTotal(@Param("condition") Map<String, Object> condition);
}
