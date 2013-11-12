package com.bit.parallel.test;


import org.testng.annotations.Test;
 
public class Test02 extends TestBase{
 
    @Test
    public void testTwitter()throws Exception
    {
        getDriver().get("https://twitter.com");
        
    }
 
}