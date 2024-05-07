package com.manger.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//树形类

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tree {
  private String name;
  private String [] school;
  private String [] profession;
}
