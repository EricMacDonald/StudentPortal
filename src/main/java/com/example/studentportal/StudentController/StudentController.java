package com.example.studentportal.StudentController;

import com.example.studentportal.StudentModel.Student;
import com.example.studentportal.StudentRepo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@CrossOrigin
@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;


    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/get-Student/{identity}")
    public Student getSingleAddress(@PathVariable("identity") Integer id){

        return studentRepository.findById(id).get();

    }

    @DeleteMapping("/Students/remove/{id}")
    public boolean deleteStudent(@PathVariable("id") Integer id){
        if(!studentRepository.findById(id).equals(Optional.empty())){
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/Students/update/{id}")
    public Student updateStudent(@PathVariable("id") Integer id,
                                 @RequestBody Map<String, String> body){

        Student current = studentRepository.findById(id).get();
        current.setFirstName(body.get("first_name"));
        current.setLastName(body.get("last_name"));
        current.setEmail(body.get("email"));
        current.setAddress(body.get("address"));
        studentRepository.save(current);
        return current;
    }

    @PostMapping("/Students/add")
    public Student createStudent(@RequestBody Map<String, String> body){

        String firstname = body.get("first_name");
        String lastname = body.get("last_name");
        String email = body.get("email");
        String address = body.get("address");
        Student newStudent = new Student(firstname, lastname, email, address);

        return studentRepository.save(newStudent);
    }





}
