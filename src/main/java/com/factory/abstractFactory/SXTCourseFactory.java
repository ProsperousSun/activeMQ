package com.factory.abstractFactory;

import com.factory.ICourse;
import com.factory.PythonCourse;

public class SXTCourseFactory implements ICourseStudyFactory {
    @Override
    public ICourse mainCourse() {
        return new PythonCourse();
    }

    @Override
    public IDirectCourse getIDirectCourse() {
        return null;
    }

    @Override
    public IRecordCourse getIRecordCourse() {
        return null;
    }

    @Override
    public IPrepareCourse getIPrepareCourse() {
        return null;
    }
}
