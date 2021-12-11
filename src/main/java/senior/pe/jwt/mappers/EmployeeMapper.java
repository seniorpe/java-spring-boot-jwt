package senior.pe.jwt.mappers;

import senior.pe.jwt.entities.Employee;
import senior.pe.jwt.entities.dtos.EmployeeDTO;

public class EmployeeMapper {
	
	public static EmployeeDTO entityToDTO(Employee emp) {
		
		EmployeeDTO empdto = new EmployeeDTO();
		empdto.setFirstName(emp.getFirstName());
		empdto.setLastName(emp.getLastName());
		empdto.setFunction(emp.getFunction());
		empdto.setSalary(emp.getSalary());
		
		return empdto;
		
	}
	
	public static Employee dtoToEntity(EmployeeDTO empdto) {
		
		Employee emp = new Employee();
		emp.setFirstName(empdto.getFirstName());
		emp.setLastName(empdto.getLastName());
		emp.setFunction(empdto.getFunction());
		emp.setSalary(empdto.getSalary());
		
		return emp;
	}

}
