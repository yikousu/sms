package com.manger.sms.service.Profession.impl;

import com.manger.sms.dao.Profession.ProfessionMapper;
import com.manger.sms.domain.Profession;
import com.manger.sms.service.Profession.ProfessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



@Service
public class ProfessionServiceImpl implements ProfessionService {
  @Resource
  private ProfessionMapper professionMapper;

  @Override
  public List<Profession> getProfessionList() {
    return professionMapper.getProfessionList();
  }
}
