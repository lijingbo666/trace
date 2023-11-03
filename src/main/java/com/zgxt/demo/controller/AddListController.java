package com.zgxt.demo.controller;

import com.zgxt.demo.dao.AddList;
import com.zgxt.demo.dao.UserSchool;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AddListController {
    @ResponseBody
    @GetMapping(path = "/addList", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addList() throws Exception {
        AddList addList = new AddList();

        return addList.toString();
    }
}
