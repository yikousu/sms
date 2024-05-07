package com.manger.sms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


//课程类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

  private String id;
  private String name;
  private Double credits;
  private Integer score;
  private Integer number;
  private Integer year;
  private Integer term;
  private Integer type;
  private String profession;
  private String grade;
  private String realName;
  private String no;
  private String studentId;
  private String pointByUser;
  private String scoreByUser;
  private String creditsByUser;
  private Integer start;
  private Integer end;
  private String room;
  private Date createTime;
}
