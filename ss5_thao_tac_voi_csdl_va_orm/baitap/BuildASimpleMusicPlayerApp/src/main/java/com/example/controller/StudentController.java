package com.example.controller;

import com.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/student","/home"})
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView showStudentList(){
        return new ModelAndView("student", "studentList", studentService.findAll());
    }

    @PostMapping("/list")
    public ModelAndView showStudentList1(){
        return new ModelAndView("student", "studentList", studentService.findAll());
    }


}
