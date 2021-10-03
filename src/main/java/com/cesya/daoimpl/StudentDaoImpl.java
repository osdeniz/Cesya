package com.cesya.daoimpl;

import com.cesya.dao.IFoodDao;
import com.cesya.dao.IStudentDao;
import com.cesya.entity.StudentEntity;
import com.cesya.repository.IFoodRepository;
import com.cesya.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoImpl implements IStudentDao {

    @Autowired IStudentRepository studentRepository;


    @Override
    public List<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity update(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity register(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity getByStudentId(long id) {
        StudentEntity student = studentRepository.findById(id);
        return student;
    }

    @Override
    public int removeById(Long id) {
        studentRepository.deleteById(id);
        return 1;
    }
}
