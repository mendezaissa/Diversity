package com.example.diversity.services;

import com.example.diversity.daos.DiversityDao;
import com.example.diversity.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiversityService {

    DiversityDao dao;

    @Autowired
    public DiversityService( DiversityDao dao ){
        this.dao = dao;
    }

    public void addGovernor(Governor g){
        dao.addGovernor(g);
    }

    public List<Governor> getAllGovernors(){
        List<Governor> allGovernors = dao.getAllGovernors();
        return allGovernors;
    }
    
    public List<HOR> getAllHORs(){
        List<HOR> allHORs = dao.getAllHORs();
        return allHORs;
    }

    public void addHOR(){
        
    }
    
    public List<Mayor> getAllMayors(){
        List<Mayor> allMayors = dao.getAllMayors();
        return allMayors;
    }

    public List<Senator> getAllSenators(){
        List<Senator> allSenators = dao.getAllSenators();
        return allSenators;
    }

    public List<Person> getAllPersons(){
        List<Person> allPersons = dao.getAllPersons();
        return allPersons;
    }

}
