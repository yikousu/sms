package com.manger.sms.service.Score;

import com.manger.sms.dto.Course;
import com.manger.sms.dto.Score;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 分数信息类
 **/
public interface ScoreService {

  //根据班级等信息获取课程信息
  PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);

  //录入成绩
  void addEntry(List<Score> list);

  //导出成绩到Excel
  List<Course> getExportList(Map<String, Object> condition);

  //根据成绩划分等级（不及格、及格、优秀）
  List<Map<String, Object>> getUserNum(Map<String, Object> condition);

  //学生用户根据id获取总学分和总绩点
  Map<String, Object> getUserTotal(Map<String, Object> condition);
}
