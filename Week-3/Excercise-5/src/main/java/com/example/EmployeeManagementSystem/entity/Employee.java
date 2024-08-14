package com.example.EmployeeManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
@NamedQueries({
        @NamedQuery(name = "Employee.findByDepartment", query = "SELECT e FROM Employee e WHERE e.department.name = :departmentName"),
        @NamedQuery(name = "Employee.findByNameLike", query = "SELECT e FROM Employee e WHERE e.name LIKE :namePattern")
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    @JsonBackReference  // Add this annotation
    private Department department;
}