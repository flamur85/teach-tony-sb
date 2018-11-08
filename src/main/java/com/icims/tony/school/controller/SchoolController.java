package com.icims.tony.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icims.tony.demo.services.DemoServiceInterface;
import com.icims.tony.school.dto.ClassDTO;
import com.icims.tony.school.dto.CourseDTO;
import com.icims.tony.school.entities.CourseEntity;
import com.icims.tony.school.repositories.CourseRepository;

@RestController
@RequestMapping("school")
public class SchoolController {
	
	@Autowired
	private CourseRepository courseRepository;

	@GetMapping("/class")
	public ClassDTO getClassDTO() {
		return new ClassDTO();
	}
	
	@GetMapping("/1/course/{id}")
	public CourseDTO getCourseDTO(@PathVariable String id) {
		CourseDTO course = new CourseDTO();
		course.getCourse();
		return new CourseDTO();
	}

	@PostMapping(path = "/1/course", consumes = "application/json", produces = "application/json")
	public CourseDTO postCourseDTO(@RequestBody CourseDTO course) {
		CourseEntity courseEntity = new CourseEntity();
		courseEntity.setSchoolId(1);
		courseEntity.setRoom(course.getRoom());
		courseEntity.setSubject(course.getSubject());
		courseRepository.save(courseEntity);
		
		CourseDTO returnCourseDTO = new CourseDTO();
		returnCourseDTO.setCourse(courseEntity.getCourseId());
		return returnCourseDTO;
	}
	
	@PutMapping("/1/course/{id}")
	public CourseDTO putCourseDTO(@RequestBody CourseDTO course) {
		return new CourseDTO();
	} 
	
	@DeleteMapping("/1/course/{id}")
	public CourseDTO deleteCourseDTO(@RequestBody CourseDTO course) {
		return new CourseDTO();
	} 
}
