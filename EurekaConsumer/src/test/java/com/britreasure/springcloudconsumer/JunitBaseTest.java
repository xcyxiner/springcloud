package com.britreasure.springcloudconsumer;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author xcyxiner
 * @create: 2018-10-26 上午9:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public abstract class JunitBaseTest {
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }
}
