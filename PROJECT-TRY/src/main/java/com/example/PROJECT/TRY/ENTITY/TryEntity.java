package com.example.PROJECT.TRY.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TryEntity")
public class TryEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Long Id;
    @Column(nullable = false)
    private  String Fname;
    @Column(nullable = false)
    private String Mname;
    @Column(nullable = false)
    private    String Lname;

}
