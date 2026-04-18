package com.example.demo.controller;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
private final EmployeeService service;
public EmployeeController(EmployeeService service){this.service=service;}
@GetMapping
public List<Employee> getAll(){return service.getAll();}
@PostMapping
public Employee create(@RequestBody Employee e){return service.save(e);}
@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){service.delete(id);}
}