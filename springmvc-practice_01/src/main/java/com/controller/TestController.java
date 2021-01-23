package com.controller;

import com.alibaba.fastjson.JSON;
import com.dto.ProjectDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/sayHi")
    public String sayHi(Model model) {
        model.addAttribute("message","Hello Spring Mvc");
        return "welcome";
    }

    @RequestMapping("/sayHello")
    @ResponseBody
    public ProjectDTO sayHello(@RequestBody ProjectDTO projectDTO) {
        logger.info("请求参数{}", JSON.toJSONString(projectDTO));
        return projectDTO;
    }
}
