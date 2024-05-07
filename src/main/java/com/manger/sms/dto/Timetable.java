package com.manger.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//课表类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timetable {

  private Integer id;
  private Integer weekId;
  private String profession;
  private String grade;
  private Integer year;
  private Integer term;
}
