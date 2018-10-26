package com.britreasure.springcloudconsumer.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xcyxiner
 * @create: 2018-10-26 上午9:09
 */
@FeignClient(name = "spring-cloud-producer")
@Service
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
