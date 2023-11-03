package com.zgxt.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.zgxt.demo.dao.JDBCUtil;
import com.zgxt.demo.dao.LookList;
import com.zgxt.demo.dao.UserSchool;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LookListController {


    @ResponseBody
    @GetMapping(path="/users", produces= MediaType.APPLICATION_JSON_VALUE)
    public String userInfo(String userName)throws Exception{

        LookList lookList=new LookList();
        //声明返回对象
        JSONObject _outPut = new JSONObject();

        List<UserSchool>  users=lookList.getUsers();

        _outPut.put("data",users);
        return _outPut.toJSONString();
    }
}
