package cn.spring.basic.controller;


import cn.spring.basic.common.model.UserDO;
import cn.spring.basic.mapper.UserMapper;
import cn.spring.basic.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Testcontroller {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TestService testService;

    // 通过 http://127.0.0.1:8081/index 访问
    @RequestMapping("/index")
    public String showIndex() {
        testService.aa();

        List<UserDO> select = userMapper.select();

        return "index";
    }

    // 通过 http://127.0.0.1:8081/ 访问
    @RequestMapping("/showIndex")
    public ModelAndView indexTwo() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping(value = "/select")
    public List<UserDO> select() throws Exception {
        List<UserDO> select = userMapper.select();
        return select;
    }

}
