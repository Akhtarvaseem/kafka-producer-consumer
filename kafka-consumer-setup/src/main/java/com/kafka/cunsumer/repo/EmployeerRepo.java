package com.kafka.cunsumer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kafka.cunsumer.Entity.Employee;

public interface EmployeerRepo extends JpaRepository<Employee, Integer>{

}
