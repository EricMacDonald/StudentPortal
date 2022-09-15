package com.example.studentportal.StudentModel;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@ToString
@Entity(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "first_name")
    private @Setter String FirstName;
    @Column(name = "last_name")
    private @Setter String LastName;
    @Column(name = "email")
    private @Setter String Email;
    @Column(name = "address")
    private @Setter String Address;


    public Student(String firstName, String lastName, String email, String address) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Address = address;
    }
}
