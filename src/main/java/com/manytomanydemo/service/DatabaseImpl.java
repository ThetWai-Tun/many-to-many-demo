package com.manytomanydemo.service;

import com.manytomanydemo.domain.Student;
import com.manytomanydemo.domain.Subject;
import com.manytomanydemo.repository.StudentRepository;
import com.manytomanydemo.repository.SubjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseImpl implements IDatabase {

    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;

    public DatabaseImpl(StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    @Override
    @Transactional
    public void createTable() {
        Student s1 = new Student("Tun Tun",22,"Latha");
        Student s2 = new Student("Aung Aung",23,"Baham");
        Student s3 = new Student("Mg Mg",24,"Hlaing");

        Subject sub1 = new Subject("Java",6);
        Subject sub2 = new Subject("Php",7);
        Subject sub3 = new Subject("Python",5);






        s1.getSubjectList().add(sub1);
        s2.getSubjectList().add(sub1);
        s3.getSubjectList().add(sub1);
        sub1.getStudentList().add(s1);
        sub1.getStudentList().add(s2);
        sub1.getStudentList().add(s3);

        s2.getSubjectList().add(sub2);
        sub2.getStudentList().add(s2);
        s3.getSubjectList().add(sub3);
        sub3.getStudentList().add(s3);

//        subjectRepository.save(sub1);
//        subjectRepository.save(sub2);
//        subjectRepository.save(sub3);

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);
    }
}
