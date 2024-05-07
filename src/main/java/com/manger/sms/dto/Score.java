package com.manger.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//分数类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {

  private Integer id;
  private String username;
  private String name;
  private String scoreByUser;
  private String pointByUser;
  private String creditsByUser;
  private Integer score;
  private String credits;
  private Integer term;
  private Integer year;
  private String no;
  private String studentId;
  private String courseId;
}
