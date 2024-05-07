package com.manger.sms.controller.User;

import com.manger.sms.dto.User;
import com.manger.sms.service.User.StudentService;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *学生账号层
 **/
@RestController
@RequestMapping("/api/sms/user/student")
public class StudentController {
  @Autowired
  private StudentService studentService;

  @PostMapping
  public void addStudent(@RequestBody User user) {
    studentService.addStudent(user);
  }

  @DeleteMapping("/{ids}")
  public void delete(@PathVariable("ids") String[] ids) {
    List<String> idsList = Arrays.asList(ids);
    studentService.delete(idsList);
  }

  @PutMapping
  public void update(@RequestBody User user) {
    studentService.update(user);
  }
  @GetMapping("/getStudentList")
  public PagingResult<User> getStudentList (@RequestParam Map<String, Object> condition,
                                            @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                            @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {
    RowBounds rowBounds = new RowBounds(offset, limit);
    return studentService.getStudentList(rowBounds, condition);
  }
}
