package com.app.todoapp.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;


}
