package com.jiabao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author majiabao on 2018/1/19.
 */
@Controller
@RequestMapping("/door")
public class DoorController {

    @Resource
    Example example;
    @Resource
    Demo demo;

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        String address1 = demo.getZkAddress();
        String address2 = example.getZkAddress();
        return "success";
    }
}
