package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

import java.util.List;
//import java.util.list;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

}
