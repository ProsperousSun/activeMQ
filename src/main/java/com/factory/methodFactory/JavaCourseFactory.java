package com.factory.methodFactory;

import com.factory.ICourse;
import com.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createFactory() {
        return new JavaCourse();
    }
}
