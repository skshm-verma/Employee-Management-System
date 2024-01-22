package com.skshm_crud_emp.Repository;

import com.skshm_crud_emp.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // This will be AUTO IMPLEMENTED by Spring into a Bean
}