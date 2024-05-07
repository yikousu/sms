package com.manger.sms.controller.Profession;

import com.manger.sms.domain.Profession;
import com.manger.sms.service.Profession.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 专业层
 **/
@RestController
@RequestMapping("/api/sms/profession")
public class ProfessionController {

  @Autowired
  private ProfessionService professionService;

  @GetMapping("/getProfessionList")
  private List<Profession> getProfessionList () {
    return professionService.getProfessionList();
  }
}
