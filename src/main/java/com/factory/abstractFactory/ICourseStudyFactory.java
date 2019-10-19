package com.factory.abstractFactory;

import com.factory.ICourse;

// 所有 工厂都会做相同的事情
public interface ICourseStudyFactory {


    ICourse mainCourse();
    //获取直播课程
    IDirectCourse getIDirectCourse();
    //获取录播课程
    IRecordCourse getIRecordCourse();
    //获取预习资料
    IPrepareCourse getIPrepareCourse();


}
