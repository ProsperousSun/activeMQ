package com.factory.simpleFactory;

import com.factory.ICourse;
import com.factory.JavaCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.createSimpleFactory(JavaCourse.class);
        course.direct();
    }
}
