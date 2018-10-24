package com.britreasure.springcloudproducer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xcyxiner
 * @create: 2018-10-24 上午10:42
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return  "hello"+name+",this is first message";
    }
}
