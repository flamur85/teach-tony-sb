package com.icims.tony.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icims.tony.demo.entities.DemoEntity;
import com.icims.tony.school.entities.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long>{

}
