package com.factory.abstractFactory;

import com.factory.ICourse;
import com.factory.JavaCourse;

public class GPCourseFactory implements ICourseStudyFactory {
    @Override
    public ICourse mainCourse() {
        return new JavaCourse();
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
