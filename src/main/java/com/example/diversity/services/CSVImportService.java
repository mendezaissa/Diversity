package com.example.diversity.services;

import com.example.diversity.models.Governor;
import com.example.diversity.models.HOR;
import com.example.diversity.models.Person;
import com.example.diversity.models.Senator;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CSVImportService {

    DiversityService service;
    @Autowired
    public CSVImportService(DiversityService service){
        this.service=service;
    }
    public List<Integer> importPersons(String filepath) throws IOException {
//        Integer id;
//        String name;
//        char gender;
//        String race;
//        LocalDate birth;
//        String religion;
//        String orientation;
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line = "";
        List<Integer> ids = new ArrayList<>();
        while((line= reader.readLine())!=null){
            String[] splits = line.split(",");
            Person p = parsePersonFromSplits(splits);
            ids.add(p.getId());
        }
        return ids;
    }
    public void importGovernors(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line ="";
        while((line= reader.readLine())!= null){
            //
            //    Person person;
            //    LocalDate yearStart;
            //    LocalDate yearEnd;
            //    String state;
            String[] splits = line.split(",");
            Person p=parsePersonFromSplits(splits);



        }
    }
    public Person parsePersonFromSplits( String[] splits){
        Person p = new Person();
        p.setName(splits[0]);
        p.setGender(splits[1].charAt(0));
        p.setRace(splits[2]);
        p.setBirth(LocalDate.of(Integer.parseInt(splits[3]),1,1));
        p.setReligion(splits[4]);
        p.setOrientation(splits[5]);
        return p;
    }
    public Governor ParseGovernorFromSplits (Person person,String[] splits){
        Governor g = new Governor();
        g.setPerson(person);
        g.setState(splits[6]);
        g.setYearStart(LocalDate.of(Integer.parseInt(splits[7]),1,1));
        g.setYearEnd(LocalDate.of(Integer.parseInt(splits[8]),1,1));
        return g;
    }
    public Senator ParseSenatorFromSplits (Person person, String[] splits){
        Senator g = new Senator();
        g.setPerson(person);
        g.setState(splits[6]);
        g.setYearStart(LocalDate.of(Integer.parseInt(splits[7]),1,1));
        g.setYearEnd(LocalDate.of(Integer.parseInt(splits[8]),1,1));
        return g;
    }
    public HOR ParseHORFromSplits (Person person, String[] splits){
        HOR g = new HOR();
        g.setPerson(person);
        g.setState(splits[6]);
        g.setYearStart(LocalDate.of(Integer.parseInt(splits[7]),1,1));
        g.setYearEnd(LocalDate.of(Integer.parseInt(splits[8]),1,1));
        return g;
    }

}
