package com.course;

import java.io.File;

public class Test05 {
    public static void main(String [] args){
        File f = new File(Test05.class.getResource("/").getPath());
        System.out.println(f);
        String relativelyPath=System.getProperty("user.dir");
        System.out.println(relativelyPath);
    }
}
