package com.britreasure.springcloudproducer.Controller;

import com.britreasure.springcloudproducer.JunitBaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xcyxiner
 * @create: 2018-10-24 上午10:51
 */
public class HelloControllerTest extends JunitBaseTest {
    @Autowired
    private HelloController helloController;

    @Test
    public void TestHello(){
        String name="xcyxiner";
        Assert.assertNotNull(helloController.index(name));
        Assert.assertEquals("hello response error", "hello"+name+",this is first message",helloController.index("xcyxiner"));
    }
}
