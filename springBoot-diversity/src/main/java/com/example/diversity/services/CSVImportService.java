package com.example.diversity.services;

import com.example.diversity.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
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
            Person fromSearch = service.searchPerson(p.getName());
            if(fromSearch==null){
                Integer id=service.addPerson(p);
                p.setId(id);
                Governor parsedGov=parseGovernorFromSplits(p,splits);
                service.addGovernor(parsedGov);
            } else{
                Governor parsedGov = parseGovernorFromSplits(fromSearch,splits);
                service.addGovernor(parsedGov);
            }


        }
    }
    public void importHORs(String filepath) throws IOException {
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
            Person fromSearch = service.searchPerson(p.getName());
            if(fromSearch==null){
                Integer id=service.addPerson(p);
                p.setId(id);
                HOR parsedHor=parseHORFromSplits(p,splits);
                service.addHOR(parsedHor);
            } else{
                HOR parsedHor = parseHORFromSplits(fromSearch,splits);
                service.addHOR(parsedHor);
            }


        }
    }
    public void importSenators(String filepath) throws IOException {
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
            Person fromSearch = service.searchPerson(p.getName());
            if(fromSearch==null){
                Integer id =service.addPerson(p);
                p.setId(id);
                Senator parsedSenator=parseSenatorFromSplits(p,splits);
                service.addSenator(parsedSenator);
            } else{
                Senator parsedSenator = parseSenatorFromSplits(fromSearch,splits);
                service.addSenator(parsedSenator);
            }


        }
    }
    public void importMayors(String filepath) throws IOException {
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
            Person fromSearch = service.searchPerson(p.getName());
            if(fromSearch==null){
                Integer id=service.addPerson(p);
                p.setId(id);
                Mayor parsedMayor=parseMayorFromSplits(p,splits);
                service.addMayor(parsedMayor);
            } else{
                Mayor parsedMayor = parseMayorFromSplits(fromSearch,splits);
                service.addMayor(parsedMayor);
            }


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
    public Governor parseGovernorFromSplits (Person person,String[] splits){
        Governor g = new Governor();
        g.setPerson(person);
        g.setState(splits[8]);
        g.setYearStart(LocalDate.of(Integer.parseInt(splits[6]),1,1));
        g.setYearEnd(LocalDate.of(Integer.parseInt(splits[7]),1,1));
        return g;
    }
    public Senator parseSenatorFromSplits (Person person, String[] splits){
        Senator g = new Senator();
        g.setPerson(person);
        g.setState(splits[8]);
        g.setYearStart(LocalDate.of(Integer.parseInt(splits[6]),1,1));
        g.setYearEnd(LocalDate.of(Integer.parseInt(splits[7]),1,1));
        return g;
    }
    public HOR parseHORFromSplits (Person person, String[] splits){
        HOR g = new HOR();
        g.setPerson(person);
        g.setState(splits[8]);
        g.setYearStart(LocalDate.of(Integer.parseInt(splits[6]),1,1));
        g.setYearEnd(LocalDate.of(Integer.parseInt(splits[7]),1,1));
        return g;
    }
    public Mayor parseMayorFromSplits (Person person, String[] splits){
        Mayor g = new Mayor();
        g.setPerson(person);
        g.setCity(splits[8]);
        g.setState(splits[9]);
        g.setYearStart(LocalDate.of(Integer.parseInt(splits[6]),1,1));
        g.setYearEnd(LocalDate.of(Integer.parseInt(splits[7]),1,1));
        return g;
    }

}
