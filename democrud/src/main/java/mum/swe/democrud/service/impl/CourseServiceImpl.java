package mum.swe.democrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.swe.democrud.model.Course;
import mum.swe.democrud.model.Student;
import mum.swe.democrud.repository.CourseRepository;
import mum.swe.democrud.repository.StudentRepository;
import mum.swe.democrud.service.CourseService;
import mum.swe.democrud.service.StudentService;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	@Override
	public Course save(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course findOne(Long id) {
		return courseRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		courseRepository.delete(id);
	}

}
