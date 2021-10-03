package com.cesya.repository;

import com.cesya.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IStudentRepository extends CrudRepository<StudentEntity, Long> {

    List<StudentEntity> findAll();

    StudentEntity findById(long id);
}
