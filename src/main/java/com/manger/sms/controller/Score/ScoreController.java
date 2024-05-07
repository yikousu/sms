package com.manger.sms.controller.Score;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.manger.sms.dto.Course;
import com.manger.sms.dto.Score;
import com.manger.sms.service.Score.ScoreService;
import com.manger.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 *  成绩查询层
 **/

@RestController
@RequestMapping("/api/sms/score")
public class ScoreController {

  @Autowired
  private ScoreService scoreService;
  @GetMapping("/getCourseList")
  public PagingResult<Course> getCourseList (@RequestParam Map<String, Object> condition,
                                             @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                             @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {
    RowBounds rowBounds = new RowBounds(offset, limit);
    return scoreService.getCourseList(rowBounds, condition);
  }
  @PostMapping
  private void addEntry(@RequestBody JSONArray UserScore) {
    List<Score> list = JSONObject.parseArray(UserScore.toJSONString(), Score.class);
    scoreService.addEntry(list);
  }
  @GetMapping("/export")
  public List<Course> getExportList (@RequestParam Map<String, Object> condition) {
    return scoreService.getExportList(condition);
  }
  @GetMapping("/getUserNum")
  public List<Map<String, Object>> getUserNum (@RequestParam Map<String, Object> condition) {
    return scoreService.getUserNum(condition);
  }

  @GetMapping("/getUserTotal")
  public Map<String, Object> getUserTotal (@RequestParam Map<String, Object> condition) {
    return scoreService.getUserTotal(condition);
  }
}
