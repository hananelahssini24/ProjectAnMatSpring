package com.lahssini.demoan.services;

import com.lahssini.demoan.entities.Employe;
import com.lahssini.demoan.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    public Optional<Employe> getEmployeById(Long id) {
        return employeRepository.findById(id);
    }

    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }
    public Employe updateEmployee( Employe newEmployeeData,Long id) {
        Optional<Employe> optionalEmployee = employeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employe existingEmployee = optionalEmployee.get();
            existingEmployee.setFirstName(newEmployeeData.getFirstName());
            existingEmployee.setLastName(newEmployeeData.getLastName());
            existingEmployee.setDate(newEmployeeData.getDate());
            return employeRepository.save(existingEmployee);
        } else {
            throw new RuntimeException("Employee not found with id " + id);
        }
    }


}
