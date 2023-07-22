package uz.ikhtidev.second_app.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import uz.ikhtidev.second_app.domain.Employee;
import uz.ikhtidev.second_app.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id){
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findByName(String name){
        return employeeRepository.findByNameQueryNative(name);
    }

    public List<Employee> findByParam(String name){
        return employeeRepository.findAllByNameLikeQuery(name);
    }

    public void delete(Long id){
        employeeRepository.deleteById(id);
    }

    @Scheduled(cron = "0 35 17 * * *")
    public Employee saveSchedule(){
        Employee employee = new Employee();
        employee.setName("ddddd");
        employee.setLastName("ddddddddddddd");
        return employeeRepository.save(employee);
    }
}
