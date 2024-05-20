package com.lahssini.demoan.repository;

import com.lahssini.demoan.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
