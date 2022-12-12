package com.nest.nestApp_backend.dao;

import com.nest.nestApp_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
