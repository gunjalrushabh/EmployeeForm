package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.app.entity.Employ;
import com.app.entity.Employee;

public interface EmployRepository extends JpaRepository<Employee, Long>{

}
