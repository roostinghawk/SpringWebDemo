package com.liuw.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuwei
 * @date 2018/2/7
 */
@Slf4j
@RequestMapping("/test")
@RestController
public class TestController {

    @Value("${test.repeat.times: 3}")
    private String repeatTimes;

    @Value("${test.repeat.times2: 1}")
    private String repeatTimes2;

    @RequestMapping(method = RequestMethod.GET)
    public String testVal(){
        TestController.log.info("配置项repeatTimes：" + repeatTimes);
        TestController.log.info("配置项repeatTimes2：" + repeatTimes2);

        return repeatTimes;
    }
}
