package com.example.diversity.daos;

import com.example.diversity.models.Governor;
import com.example.diversity.models.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("production")
class PostgresDiversityDaoTest {

    @Autowired
    DiversityDao dao;

    @Test
    void getAllGovernors() {

        List<Governor> allGovernors = dao.getAllGovernors();
        Governor elliot = allGovernors.get(0);
        System.out.println("");
    }

    @Test
    void addGovernor() {
        Governor governor = new Governor();

        Person person = new Person();
        person.setId(1);
        person.setName("Eliot");
        person.setGender('M');
        person.setReligion("Atheist");
        person.setRace("Asian");
        person.setOrientation("Hetero");

        LocalDate birth = LocalDate.of(1995,01,12);
        person.setBirth( birth );

        dao.addPerson( person );

        governor.setPerson( person );
        governor.setYearStart( LocalDate.of(2020, 1, 1) );
        governor.setYearEnd( LocalDate.of(2020,1,1));
        governor.setState("TX");

        dao.addGovernor( governor );
    }

    @Test
    void getAllSenators() {
    }

    @Test
    void addSenator() {
    }

    @Test
    void getAllHORs() {
    }

    @Test
    void addHOR() {
    }

    @Test
    void getAllMayors() {
    }

    @Test
    void addMayor() {
    }

    @Test
    void getAllPersons() {
    }

    @Test
    void addPerson() {
    }
}