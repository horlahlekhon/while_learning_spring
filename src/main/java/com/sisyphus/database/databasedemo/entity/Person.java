package com.sisyphus.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity // JPA: mark the class as an entity class that mapos toa database table. this will also trigger a schema update every
//time we run the app, so if the table isnt created it will create it, this means we do not need to write 
//an sql script to manage the table creation again.
//@Table("person") : JPA : this is used if the table we are mapping to doesnt have the same name as the class
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

    @Id //JPA
    @GeneratedValue //JPA: the JPA will create a sequence in the database and use it to auto populate the id whnever 
    //the entity is created, ao the id is autogenerated
    private int id;
    private String name;
    private String location;
    private Date birthDate;

    //this no args constructor is used by the BeanPropertyRowMapper, will throw an exception whenever it 
    //cannot find a no args conbstructor on the bean it wanted to map. although by default java provide
    //a no args constructor for us free, but it is ovverriden when we create a constructor.
    public Person(){}


    public Person(int id, String name, String location, Date birthDate){

        this.id = id;

        // @Column("name")  //  JPA: mark that this is acolumn in the table, used if the column to map
        //.to is diff from this field
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    // JPA : since we are autogenerating the id we would need a cpnstructor that doesnt take id
    public Person(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return  String.format("\n id -> %s ; name -> %s ; location -> %s ; birth date -> %s.  ", this.id, getName(), getLocation(), getBirthDate());
    }

}