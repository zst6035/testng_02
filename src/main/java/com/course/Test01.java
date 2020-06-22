package com.course;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01 {
    @Test
    public void test01(){
        int i=1;
        int j=2;
        Assert.assertEquals(i,j);

    }

    @Test
    public void test02(){
        int i=1;
        int j=1;
        Assert.assertEquals(i,j);

    }
    @Test
    public void test03(){
        int i=1;
        int j=1;
        Assert.assertEquals(i,j);

    }
}
