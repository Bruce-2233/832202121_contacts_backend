package org.example.controller;

import org.example.common.Result;
import org.example.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WebController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello 青哥哥";
    }

    @GetMapping("/weather")
    public Result weather() {
        return Result.success("今天天气：晴 23摄氏度");
    }

    @GetMapping("/count")
    public Result count() {
        throw new CustomException("400", "错误！禁止请求");
//        throw new RuntimeException("错误！禁止请求");
    }

    @GetMapping("/map")
    public Result map() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "青哥哥");
        map.put("age", 32);
        return Result.success(map);
    }
}
