package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
 //       throw new RuntimeException();
    }

    //test2依赖test1运行，当test1失败时，test2不运行
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}
