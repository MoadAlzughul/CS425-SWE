package mum.swe.democrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.swe.democrud.model.Course;
import mum.swe.democrud.model.Student;

@Repository("coursetRepository")
public interface CourseRepository extends JpaRepository<Course, Long> {
}
