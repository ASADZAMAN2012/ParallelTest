package com.bit.parallel.test;

import org.testng.annotations.Test;
 
public class Test04  extends TestBase{
 
    @Test
    public void testYahoo()throws Exception
    {
        getDriver().get("http://www.yahoo.com");
    }
}