package cn.spring.basic.controller;


import cn.spring.basic.common.result.BasicResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);


    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;


    @PostMapping(value = "/postQuery")
    public BasicResult queryAll() {
//        crossDomainSolved(request, response);
        return new BasicResult();
    }


    @GetMapping("getQuery")
    public BasicResult aa(HttpServletRequest request, HttpServletResponse response, @RequestParam("data") String data) {
        return new BasicResult();
    }


}
