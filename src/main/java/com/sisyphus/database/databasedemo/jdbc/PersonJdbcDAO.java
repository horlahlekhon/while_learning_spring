package com.sisyphus.database.databasedemo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import com.sisyphus.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // we can define our own rowMapper if the data that is comming from the database
    // has a different structure to the entity class that we want
    // to map it to
    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();

            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getTimestamp("birth_date"));

            return person;

        }
        
    }

    //do a select all from db
    public List<Person> findAll() {
        //jdbctemplate.query is one of many implementation which allow us to write sql query and get the result 
        //her what will be returned will be a list of the rows that we querried, the second param specify
        //the class that we want to map it to, and the second param only works if the table column names are the same as the 
        //one used in the class. BeanPropertyRowMapper is a mapper which do the lifting of mapping the database rows to the class passed in
        //and it returns a list of the entity.
        return jdbcTemplate.query("SELECT * FROM PERSON", new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(int id){

        //queryFormObject is used to get a single Bean from the database, whenever a query takes a parametre 
        //like the id we want to search for , we would replace it with a question mark and pass it as an array, this array will rep the 
        // argObjects to the query, and its 'first come first serve motif' 
        return  jdbcTemplate.queryForObject("Select * from person where id=?", new Object[]{id}, new PersonRowMapper());
    }

    public int deleteById(int id){

        //we use update to delete, and update returns an int which rep the amount of rows that was affected by the query.
        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});
    }

    public int insert(Person person){

        return jdbcTemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(?, '?','?', ?)",
                new Object[] { person.getId(), person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()) });
    }

    public int update(Person person) {

        return jdbcTemplate.update(
            "update person " + 
                "set name=?, location=?, birth_date=?" + 
                    "where id =?",
                new Object[] {person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()), person.getId()});
    }
}