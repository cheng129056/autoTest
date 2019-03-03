package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("class1内的stu1被运行");
    }
    public void stu2(){
        System.out.println("class1内的stu2被运行");
    }
    
}
