package com.bit.parallel.test;

import org.testng.annotations.Test;
 
public class Test01 extends TestBase{
 
    @Test
    public void testFacebook()throws Exception
    {
        getDriver().get("http://facebook.com");
        
    }
}