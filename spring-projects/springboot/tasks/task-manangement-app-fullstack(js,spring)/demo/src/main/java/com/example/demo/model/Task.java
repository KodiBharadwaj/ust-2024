package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {

    private int id;

    private String username;

    private String description;

    private LocalDate date;

    private String status;
}
