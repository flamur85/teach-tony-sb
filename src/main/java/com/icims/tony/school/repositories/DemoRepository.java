package com.icims.tony.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.icims.tony.demo.entities.DemoEntity;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity, Long>{

}
