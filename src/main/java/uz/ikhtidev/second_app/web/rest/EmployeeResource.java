package uz.ikhtidev.second_app.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ikhtidev.second_app.domain.Employee;
import uz.ikhtidev.second_app.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity create(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @PutMapping("/employees")
    public ResponseEntity update(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/employees")
    public ResponseEntity getAll(){
        List<Employee> employees = employeeService.getAll();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity getEmployeeByName(@PathVariable String name){
        List<Employee> employees = employeeService.findByName(name);
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employees/search")
    public ResponseEntity getEmployeeByNameSearch(@RequestParam String name){
        List<Employee> employees = employeeService.findByParam(name);
        return ResponseEntity.ok(employees);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        employeeService.delete(id);
        return ResponseEntity.ok("Qator o'chirildi");
    }

}
