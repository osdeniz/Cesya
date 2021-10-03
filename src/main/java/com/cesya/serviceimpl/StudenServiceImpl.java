package com.cesya.serviceimpl;

import com.cesya.dao.IStudentDao;
import com.cesya.dto.StudentDto;
import com.cesya.entity.StudentEntity;
import com.cesya.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenServiceImpl implements IStudentService {

    @Autowired IStudentDao studentDao;

    @Override
    public StudentEntity create(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(studentDto.getName());
        studentEntity.setLastName(studentDto.getLastName());
        studentEntity.setStudentClass(studentDto.getStudentClass());
        studentEntity.setSchoolName(studentDto.getSchoolName());
        studentEntity.setScore(studentDto.getScore());
        return studentDao.register(studentEntity);
    }

    @Override
    public StudentEntity update(StudentDto studentDto) throws Exception {
        StudentEntity student = studentDao.getByStudentId(studentDto.getId());
        if(student == null){
            throw new Exception("Sistemde kayıtlı kullanıcı bulunamadı.");
        }
        student.setName(studentDto.getName());
        student.setLastName(studentDto.getLastName());
        student.setStudentClass(studentDto.getStudentClass());
        student.setSchoolName(studentDto.getSchoolName());
        student.setScore(studentDto.getScore());
        return studentDao.update(student);
    }

    @Override
    public StudentEntity getById(Long id) {
        return studentDao.getByStudentId(id);
    }

    @Override
    public String removeStudent(Long id) {
        int result = studentDao.removeById(id);
        return result == 1 ? "işlem başarılı.":"işlem başarısız.";
    }

    @Override
    public List<StudentEntity> getStudents() {
        return studentDao.getStudents();
    }
}
