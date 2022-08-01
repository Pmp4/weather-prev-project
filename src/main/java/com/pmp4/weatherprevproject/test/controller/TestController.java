package com.pmp4.weatherprevproject.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public Map<String, Object> testHandler() {
        logger.info("TEST 핸들러 실행");

        Map<String, Object> res = new HashMap<>();
        res.put("SUCCESS", true);

        return res;
    }

}
