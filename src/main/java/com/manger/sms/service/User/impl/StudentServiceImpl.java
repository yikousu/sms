package com.manger.sms.service.User.impl;

import com.github.pagehelper.PageRowBounds;
import com.manger.sms.dao.Profession.ProfessionMapper;
import com.manger.sms.dao.User.StudentMapper;
import com.manger.sms.domain.Profession;
import com.manger.sms.dto.User;
import com.manger.sms.service.User.StudentService;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 学生用户业务层
 **/
@Service
public class StudentServiceImpl implements StudentService {

  @Resource
  private StudentMapper studentMapper;
  @Autowired
  private ProfessionMapper professionMapper;

  @Override
  @Transactional
  public void addStudent(User user) {
    int professionId = 0;
    int count = professionMapper.checkProfessionCount(user.getProfession());
    if (count > 0) {
      Profession profession = professionMapper.getProfessionIdByName(user.getProfession());
      professionId = profession.getId();
    } else {
      Profession profession = new Profession();
      profession.setName(user.getProfession());
      professionMapper.addProfession(profession);
      professionId = profession.getId();
    }
    String professionStr = "";
    if (professionId < 10) {
      professionStr = "0" + Integer.toString(professionId);
    } else {
      professionStr = Integer.toString(professionId);
    }
    Map<String, Object> condition = new HashMap<>();
    condition.put("profession", user.getProfession());
    condition.put("grade", user.getGrade());
    int num = studentMapper.checkCodeCount(condition) + 1;
    String str = "";
    if (num < 10) {
      str = "0" + Integer.toString(num);
    } else if (num < 100) {
      str = Integer.toString(num);
    }
    String no = "3" + user.getAdmissionTime().substring(user.getAdmissionTime().length()-2)
        + "89" + professionStr + user.getGrade().substring(user.getGrade().length()-1) + str;
    user.setId(no);
    user.setUsername(no);
    user.setPassword("123456");
    studentMapper.addStudent(user);
  }

  @Override
  public void
  delete(List<String> ids) {
    studentMapper.delete(ids);
  }

  @Override
  public void update(User user) {
    studentMapper.update(user);
  }

  @Override
  public PagingResult<User> getStudentList(RowBounds rowBounds, Map<String, Object> condition) {
    PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
    List<User> StudentInfoList = studentMapper.getStudentList(pageRowBounds, condition);
    return new PagingResult<>(StudentInfoList, pageRowBounds.getTotal());
  }

}
