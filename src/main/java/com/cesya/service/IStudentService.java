package com.cesya.service;

import com.cesya.dto.StudentDto;
import com.cesya.entity.StudentEntity;

import java.util.List;

public interface IStudentService {

    StudentEntity create(StudentDto studentDto);

    StudentEntity update(StudentDto studentDto) throws Exception;

    StudentEntity getById(Long id);

    String removeStudent(Long id);

    List<StudentEntity> getStudents();


}
