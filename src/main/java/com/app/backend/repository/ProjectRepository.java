package com.app.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.backend.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
	
	Optional<Project>  findById(Long id);

}
