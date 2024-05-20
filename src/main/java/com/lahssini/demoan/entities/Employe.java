package com.lahssini.demoan.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDate;
@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Employe {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String firstName;
    private  String lastName;
    private LocalDate date;
}
