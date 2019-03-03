package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试组测试方法111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试组测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试组测试方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试组测试方法44444");
    }
    @BeforeGroups("server")
    public void beforeGroupsServer(){
        System.out.println("这是server组运行之前运行的");
    }
    @AfterGroups("server")
    public void afterGroupsServer(){
        System.out.println("这是server组运行之后运行的");
    }
}
