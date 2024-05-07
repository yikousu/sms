package com.manger.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//登录
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private String id;
  private String username;
  private String password;
  private String passwordAgain;
  private String realName;
  private Integer level;
  private String school;
  private String admissionTime;
  private String email;
  private String profession;
  private String phone;
  private Integer sex;
  private String grade;
  private Date createTime;
  private String token;
  private String refreshToken;
  private Integer state;
}
