package mum.swe.democrud.service;

import java.util.List;

import mum.swe.democrud.model.Course;

public interface CourseService {
	 List<Course> findAll();
	 Course save(Course course);
	 Course findOne(Long id);
	 void delete(Long id);
}
