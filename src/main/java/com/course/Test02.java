package com.course;
/*
* 执行用例，直接运行
* 还有一种是运行testng.xml文件；
* */
import org.testng.TestNG;


public class Test02 {
    public static void main(String [] args){
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { com.course.Test01.class });
        testng.run();
    }
}
