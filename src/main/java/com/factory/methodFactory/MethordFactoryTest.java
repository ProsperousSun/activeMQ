package com.factory.methodFactory;

import com.factory.ICourse;

public class MethordFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course = javaCourseFactory.createFactory();
        course.direct();
    }
}
