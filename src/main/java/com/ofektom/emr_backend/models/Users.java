package com.ofektom.emr_backend.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Users {
    Long id;
    String name;
    String designation;
    Departments department;
}
