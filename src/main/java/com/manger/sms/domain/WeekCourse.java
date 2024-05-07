package com.manger.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//课表具体类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeekCourse {

  private Integer id;
  private String monday;
  private String tuesday;
  private String wednesday;
  private String thursday;
  private String friday;
  private String saturday;
  private String sunday;
  private String profession;
  private String grade;
  private Integer year;
  private Integer term;
}
