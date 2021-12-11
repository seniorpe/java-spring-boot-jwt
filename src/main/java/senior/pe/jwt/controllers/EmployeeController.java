package senior.pe.jwt.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import senior.pe.jwt.entities.Employee;
import senior.pe.jwt.entities.dtos.EmployeeDTO;
import senior.pe.jwt.exceptions.EmployeeNotFoundException;
import senior.pe.jwt.mappers.EmployeeMapper;
import senior.pe.jwt.repositories.EmployeeRepository;

@RestController
@RequestMapping(value = "/protected")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping(value = "/employees")
	List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@GetMapping(value = "/employee/{id}")
	ResponseEntity<Employee> findById(@PathVariable("id") int id) {

		Employee emp = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with ID :" + id));

		return ResponseEntity.ok().body(emp);
	}

	@PostMapping(value = "/employees")
	ResponseEntity<?> CreateEmployee(@RequestBody EmployeeDTO empdto) {
		Employee emp = EmployeeMapper.dtoToEntity(empdto);
		Employee addedemp = employeeRepository.save(emp);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedemp.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@PutMapping(value = "/employee/{id}")
	ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody EmployeeDTO empdto) {

		Employee emp = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with ID :" + id));

		Employee empu = EmployeeMapper.dtoToEntity(empdto);
		empu.setId(emp.getId());
		employeeRepository.save(empu);
		return ResponseEntity.ok().body(empu);

	}

	@DeleteMapping(value = "/employee/{id}")
	ResponseEntity<String> deleteEmployee(@PathVariable("id") int id) {
		Employee emp = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with ID :" + id));

		employeeRepository.deleteById(emp.getId());
		return ResponseEntity.ok().body("Employee deleted with success!");

	}
}
