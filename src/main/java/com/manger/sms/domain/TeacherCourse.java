package com.manger.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//教师课程任命
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherCourse {

  private Integer id;
  private String teacherId;
  private String username;
  private String name;
  private String profession;
  private String grade;
  private Integer term;
  private Integer number;
  private String realName;
  private String courseId;
  private String credits;
  private Integer type;
  private Integer start;
  private Integer end;
  private Integer room;
}
