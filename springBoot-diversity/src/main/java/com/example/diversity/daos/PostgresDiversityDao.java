package com.example.diversity.daos;

import com.example.diversity.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
@Profile("production")
public class PostgresDiversityDao implements DiversityDao{

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Governor> getAllGovernors() {

        return template.query("SELECT p.\"id\", p.\"name\", p.\"gender\", p.\"race\", p.\"birthdate\", p.\"religion\", p.\"orientation\",\n" +
                "\tg.\"yearStart\", g.\"yearEnd\", g.\"state\"\n" +
                "\tFROM public.persons as p\n" +
                "\tright join public.governors as g on p.\"id\" = g.\"personId\";", new GovernorMapper() );

    }

    @Override
    public void addGovernor(Governor g) {
        template.update("INSERT INTO public.governors(\n" +
                "\t\"personId\", \"yearStart\", \"yearEnd\", state)\n" +
                "\tVALUES ('"+g.getPerson().getId()+"', '"+g.getYearStart()+"', '"+g.getYearEnd()+"', '"+g.getState()+"');");
    }

    @Override
    public List<Senator> getAllSenators() {

        return template.query("SELECT p.\"id\", p.\"name\", p.\"gender\", p.\"race\", p.\"birthdate\", p.\"religion\", p.\"orientation\",\n" +
                "\tg.\"yearStart\", g.\"yearEnd\", g.\"state\"\n" +
                "\tFROM public.persons as p\n" +
                "\tright join public.senate as g on p.\"id\" = g.\"personId\";", new SenatorMapper() );
    }

    @Override
    public void addSenator(Senator s) {
        template.update("INSERT INTO public.senators(\n" +
                "\t\"personId\", \"yearStart\", \"yearEnd\", state)\n" +
                "\tVALUES ('"+s.getPerson().getId()+"', '"+s.getYearStart()+"', '"+s.getYearEnd()+"', '"+s.getState()+"');");
    }

    @Override
    public List<HOR> getAllHORs() {

        return template.query("SELECT p.\"id\", p.\"name\", p.\"gender\", p.\"race\", p.\"birthdate\", p.\"religion\", p.\"orientation\",\n" +
                "\tg.\"yearStart\", g.\"yearEnd\", g.\"state\"\n" +
                "\tFROM public.persons as p\n" +
                "\tright join public.\"houseRep\" as g on p.\"id\" = g.\"personId\";", new HORMapper() );
    }

    @Override
    public void addHOR(HOR hor) {
        template.update("INSERT INTO public.\"houseRep\"(\n" +
                "\t\"personId\", \"yearStart\", \"yearEnd\", state)\n" +
                "\tVALUES ('"+hor.getPerson().getId()+"', '"+hor.getYearStart()+"', '"+hor.getYearEnd()+"', '"+hor.getState()+"');");
    }

    @Override
    public List<Mayor> getAllMayors() {

        return template.query("SELECT p.\"id\", p.\"name\", p.\"gender\", p.\"race\", p.\"birthdate\", p.\"religion\", p.\"orientation\",\n" +
                "\tg.\"yearStart\", g.\"yearEnd\", g.\"state\", g.\"city\" \n" +
                "\tFROM public.persons as p\n" +
                "\tright join public.mayors as g on p.\"id\" = g.\"personId\";", new MayorMapper() );

    }

    @Override
    public void addMayor(Mayor m) {
        template.update("INSERT INTO public.mayors(\n" +
                "\t\"personId\", \"yearStart\", \"yearEnd\", state)\n" +
                "\tVALUES ('"+m.getPerson().getId()+"', '"+m.getYearStart()+"', '"+m.getYearEnd()+"', '"+m.getState()+"');");
    }

    @Override
    public List<Person> getAllPersons() {
        return template.query("SELECT *" + "\tFROM public.persons;", new PersonMapper() );
    }

    @Override
    public Integer addPerson(Person p) {
        Integer i =  template.query("INSERT INTO public.persons(\n" +
                "\tname, gender, race, birthdate, religion, orientation)\n" +
                "\tVALUES ('"+p.getName()+"', '"+p.getGender()+"', '"+p.getRace()+"', '"+p.getBirth()+"', '"+p.getReligion()+"', '"+p.getOrientation()+"')" +
                "returning \n id;", new IdMapper() ).get(0);

        return i;
    }

    @Override
    public Person searchPerson(String name) {
        List<Person> p = template.query("SELECT *" + "\tFROM public.persons WHERE \"name\"='"+name+"';", new PersonMapper());
        if(p.size()>0)return p.get(0);
        else return null;

    }

    class GovernorMapper implements RowMapper<Governor>{
        @Override
        public Governor mapRow(ResultSet resultSet, int i) throws SQLException {
            Person p = new Person();
            Governor toReturn = new Governor();

            p.setId( resultSet.getInt("id") );
            p.setName( resultSet.getString("name"));
            p.setBirth( resultSet.getDate("birthdate").toLocalDate() ); //double check!!!!
            p.setGender( resultSet.getString("gender").charAt(0));
            p.setOrientation( resultSet.getString("orientation"));
            p.setRace( resultSet.getString("race"));
            p.setReligion( resultSet.getString("religion"));
            
            toReturn.setPerson( p );
            toReturn.setYearStart( resultSet.getDate("yearStart").toLocalDate() );
            toReturn.setYearEnd( resultSet.getDate("yearEnd").toLocalDate() );
            toReturn.setState( resultSet.getString("state") );

            return toReturn;
        }
    }

    class SenatorMapper implements RowMapper<Senator>{
        @Override
        public Senator mapRow(ResultSet resultSet, int i) throws SQLException {
            Person p = new Person();
            Senator toReturn = new Senator();

            p.setId( resultSet.getInt("id") );
            p.setName( resultSet.getString("name"));
            p.setBirth( resultSet.getDate("birthdate").toLocalDate() ); //double check!!!!
            p.setGender( resultSet.getString("gender").charAt(0));
            p.setOrientation( resultSet.getString("orientation"));
            p.setRace( resultSet.getString("race"));
            p.setReligion( resultSet.getString("religion"));

            toReturn.setPerson( p );
            toReturn.setYearStart( resultSet.getDate("yearStart").toLocalDate() );
            toReturn.setYearEnd( resultSet.getDate("yearEnd").toLocalDate() );
            toReturn.setState( resultSet.getString("state") );

            return toReturn;
        }
    }

    class HORMapper implements RowMapper<HOR>{
        @Override
        public HOR mapRow(ResultSet resultSet, int i) throws SQLException {
            Person p = new Person();
            HOR toReturn = new HOR();

            p.setId( resultSet.getInt("id") );
            p.setName( resultSet.getString("name"));
            p.setBirth( resultSet.getDate("birthdate").toLocalDate() ); //double check!!!!
            p.setGender( resultSet.getString("gender").charAt(0));
            p.setOrientation( resultSet.getString("orientation"));
            p.setRace( resultSet.getString("race"));
            p.setReligion( resultSet.getString("religion"));

            toReturn.setPerson( p );
            toReturn.setYearStart( resultSet.getDate("yearStart").toLocalDate() );
            toReturn.setYearEnd( resultSet.getDate("yearEnd").toLocalDate() );
            toReturn.setState( resultSet.getString("state") );

            return toReturn;
        }
    }

    class MayorMapper implements RowMapper<Mayor>{
        @Override
        public Mayor mapRow(ResultSet resultSet, int i) throws SQLException {
            Person p = new Person();
            Mayor toReturn = new Mayor();

            p.setId( resultSet.getInt("id") );
            p.setName( resultSet.getString("name"));
            p.setBirth( resultSet.getDate("birthdate").toLocalDate() ); //double check!!!!
            p.setGender( resultSet.getString("gender").charAt(0));
            p.setOrientation( resultSet.getString("orientation"));
            p.setRace( resultSet.getString("race"));
            p.setReligion( resultSet.getString("religion"));

            toReturn.setPerson( p );
            toReturn.setYearStart( resultSet.getDate("yearStart").toLocalDate() );
            toReturn.setYearEnd( resultSet.getDate("yearEnd").toLocalDate() );
            toReturn.setState( resultSet.getString("state") );

            return toReturn;
        }
    }

    class PersonMapper implements RowMapper<Person>{
        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            Person p = new Person();
            p.setId( resultSet.getInt("id") );
            p.setName( resultSet.getString("name"));
            p.setBirth( resultSet.getDate("birthdate").toLocalDate() ); //double check!!!!
            p.setGender( resultSet.getString("gender").charAt(0));
            p.setOrientation( resultSet.getString("orientation"));
            p.setRace( resultSet.getString("race"));
            p.setReligion( resultSet.getString("religion"));

            return p;
        }
    }

    class IdMapper implements RowMapper<Integer>{

        @Override
        public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
            Integer toReturn = resultSet.getInt("id");
            return toReturn;
        }
    }

}
