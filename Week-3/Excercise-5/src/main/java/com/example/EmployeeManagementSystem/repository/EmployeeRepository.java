package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query methods
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByDepartmentName(String departmentName);

    // Custom JPQL query to find employees by department name
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findEmployeesByDepartment(@Param("departmentName") String departmentName);

    // Custom native query to find employees with a specific email domain
    @Query(value = "SELECT * FROM employees e WHERE e.email LIKE %:domain", nativeQuery = true)
    List<Employee> findEmployeesByEmailDomain(@Param("domain") String domain);

    // Methods to execute named queries
    @Query(name = "Employee.findByDepartment")
    List<Employee> findByDepartment(@Param("departmentName") String departmentName);

    @Query(name = "Employee.findByNameLike")
    List<Employee> findByNameLike(@Param("namePattern") String namePattern);
}
