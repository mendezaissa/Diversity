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

    public void addHOR(HOR hor){
        dao.addHOR(hor);
    }
    
    public List<Mayor> getAllMayors(){
        List<Mayor> allMayors = dao.getAllMayors();
        return allMayors;
    }
    public void addMayor(Mayor m){
        dao.addMayor(m);
    }

    public List<Senator> getAllSenators(){
        List<Senator> allSenators = dao.getAllSenators();
        return allSenators;
    }
    public void addSenator(Senator s){
        dao.addSenator(s);
    }

    public List<Person> getAllPersons(){
        List<Person> allPersons = dao.getAllPersons();
        return allPersons;
    }
    public Integer addPerson(Person p){
        return dao.addPerson(p);
    }
    public Person searchPerson(String name){return dao.searchPerson(name);}


}
