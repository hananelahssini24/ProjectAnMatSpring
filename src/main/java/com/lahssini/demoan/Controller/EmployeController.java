package com.lahssini.demoan.Controller;
import com.lahssini.demoan.entities.Employe;
import com.lahssini.demoan.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeController {

    @Autowired
    private EmployeService employeService;
    @GetMapping("/employes")
    public List<Employe> allPayments(){
        return employeService.getAllEmployes();
    }
    @PostMapping("/employes")
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }
    @DeleteMapping("/employes/{id}")  
    private void deleteEmploye(@PathVariable("id") Long id)   
    {  
    employeService.deleteEmploye(id);  
    } 
@PutMapping("/employes/{id}")
 
    public Employe updateDepartment(@RequestBody Employe employe, @PathVariable("id") Long id)
    {
         employeService.updateEmployee(employe, id);
         return employe;
    }
    
}
