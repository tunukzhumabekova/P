package Peaksoft.Interface;

import Peaksoft.Model.Student;

public interface StudentIntarface {

        Student[] getAllStudents();
        Student searchStudentByName(String name);
        void deleteStudentById(int id);
        Student[] createStuden(Student student);


        void updateById(int id, Student student);
        void findById(int id);
    }

