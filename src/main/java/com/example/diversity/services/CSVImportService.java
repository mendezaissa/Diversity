package com.example.diversity.services;

import org.springframework.beans.factory.annotation.Autowired;

public class CSVImportService {

    DiversityService service;
    @Autowired
    public CSVImportService(DiversityService service){
        this.service=service;
    }

}
