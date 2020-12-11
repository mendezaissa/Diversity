package com.example.diversity.daos;

import com.example.diversity.models.*;

import java.util.List;

public interface DiversityDao {

    List<Governor> getAllGovernors();

    void addGovernor(Governor g);

    List<Senator> getAllSenators();

    void addSenator(Senator s);

    List<HOR> getAllHORs();

    void addHOR(HOR hor);

    List<Mayor> getAllMayors();

    void addMayor(Mayor m);

    List<Person> getAllPersons();

    Integer addPerson(Person p);

    Person searchPerson(String name);

}
