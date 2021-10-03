package com.cesya.dao;

import com.cesya.entity.StudentEntity;

import java.util.List;

public interface IStudentDao {

    List<StudentEntity> getStudents();

    StudentEntity update(StudentEntity studentEntity);

    StudentEntity register(StudentEntity studentEntity);

    StudentEntity getByStudentId(long id);

    int removeById(Long id);

}
