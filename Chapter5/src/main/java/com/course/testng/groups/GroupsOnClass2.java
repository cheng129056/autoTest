package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("class内的stu1被执行");
    }
    public void stu2(){
        System.out.println("calss2内的stu2被执行");
    }
}
