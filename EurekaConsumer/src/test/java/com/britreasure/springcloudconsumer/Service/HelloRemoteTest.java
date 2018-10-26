package com.britreasure.springcloudconsumer.Service;

import com.britreasure.springcloudconsumer.JunitBaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xcyxiner
 * @create: 2018-10-26 上午9:17
 */
public class HelloRemoteTest extends JunitBaseTest {
    @Autowired
    private HelloRemote helloRemote;


    @Test
    public  void testHello(){
        String name="xcyxiner";
        Assert.assertNotNull(helloRemote.hello(name));
        Assert.assertEquals("hello response error", "hello"+name+",this is first message",helloRemote.hello("xcyxiner"));
    }
}
