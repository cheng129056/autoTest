package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("class3内的teacher1被执行");
    }
    public void teacher2(){
        System.out.println("class3内的teacher被执行");
    }
}
