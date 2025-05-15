package com.javaintro.ecommerce.repository;

import com.javaintro.ecommerce.exception.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
