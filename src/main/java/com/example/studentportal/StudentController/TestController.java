package com.example.studentportal.StudentController;

import com.example.studentportal.StudentModel.Student;
import com.example.studentportal.StudentRepo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String helloWorld(){
        return "Hello";
    }

    @RequestMapping("/index")
    public String welcome(){ //function name cannot be the same as the request mapping.
        return "StudentsIndex.html";
    }

    @RequestMapping("/update")
    public String welcome2(){ //function name cannot be the same as the request mapping.
        return "UpdateStudent.html";
    }


    @RequestMapping("/admin")
    public String adminPage(){
        return "AdminConsole.html";
    }


}




    /*@Autowired
    StudentRepository studentRepository;

   @RequestMapping("/Students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "students";

    }}*/
