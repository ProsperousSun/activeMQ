package com.factory.methodFactory;

import com.factory.ICourse;
import com.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse createFactory() {
        return new PythonCourse();
    }
}
