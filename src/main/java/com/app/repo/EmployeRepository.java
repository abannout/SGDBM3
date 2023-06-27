package com.app.repo;

import com.app.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {
}
