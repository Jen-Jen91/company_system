package com.example.CompanySystem.repositories;

import com.example.CompanySystem.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
