package com.cesya.controller;


import com.cesya.dto.StudentDto;
import com.cesya.entity.StudentEntity;
import com.cesya.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/student", produces = "application/json")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public StudentEntity register(@RequestBody StudentDto studentDto){
        return studentService.create(studentDto);
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public StudentEntity update(@RequestBody StudentDto studentDto)throws Exception{
        return studentService.update(studentDto);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id){
        return studentService.removeStudent(id);
    }

    @RequestMapping(value="users",method = RequestMethod.GET)
    public List<StudentEntity> getUsers(){
        return studentService.getStudents();
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public StudentEntity getUserInfoById(@PathVariable long id){
        return studentService.getById(id);
    }



}
