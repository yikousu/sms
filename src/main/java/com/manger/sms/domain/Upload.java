package com.manger.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//用户上传
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Upload {

  private Integer id;
  private String userId;
  private Integer level;
  private String url;
}
