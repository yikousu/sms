package com.manger.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



//课程安排类

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseInfo {

  private Integer id;
  private String courseId;
  private Integer start;
  private Integer end;
  private String room;
  private String profession;
}
