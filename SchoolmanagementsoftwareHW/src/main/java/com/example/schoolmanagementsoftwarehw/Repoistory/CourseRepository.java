package com.example.schoolmanagementsoftwarehw.Repoistory;

import com.example.schoolmanagementsoftwarehw.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
Course findCourseByid(Integer id);

}
