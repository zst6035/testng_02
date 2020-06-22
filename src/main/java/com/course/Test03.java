package com.course;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class Test03 {
    public static void main(String [] args){
        TestNG testNG=new TestNG();
        List<String> suites= Lists.newArrayList();
//        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//        System.out.println("文件是"+path);
        //获取项目根目录,直接可以运行，但是打成jar包之后就会报空指针异常；
//        File f = new File(Test03.class.getClass().getResource("/").getPath());
//        System.out.println(f);
        String f=System.getProperty("user.dir");
        System.out.println(f);
        suites.add(f+"\\classes\\testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();

    }
}
