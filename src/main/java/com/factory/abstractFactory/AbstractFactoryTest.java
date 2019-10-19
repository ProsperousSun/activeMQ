package com.factory.abstractFactory;

import com.factory.ICourse;

public class AbstractFactoryTest {

    //在实际中还是主要使用了抽象工厂方法
    public static void main(String[] args) {
        ICourseStudyFactory iCourseStudyFactory = new GPCourseFactory();
        ICourse course = iCourseStudyFactory.mainCourse();
        course.direct();
        iCourseStudyFactory.getIDirectCourse();
        iCourseStudyFactory.getIPrepareCourse();
        iCourseStudyFactory.getIRecordCourse();
    }
}
