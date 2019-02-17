package com.sisyphus.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.sisyphus.database.databasedemo.entity.Person;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

    //connection to database is done through entityManager, PersistrnceCOntext stores all the data operations
    //that is performed in a single session, and the EntityManager is the interface that is used to retrieve the 
    //operations, and also new operations are passed to the PersistenceCOntext through the entityMAnager
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id){

        return entityManager.find(Person.class, id);
    }

    public Person update(Person person){

        ///this merges the state of the entity that is passed in with the state of the one already in the database.
        //it will do an insert if it cannot find the id of the passed entity, and an update if the id already exist.
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id) {
        //before deeting in hibernate , we must first be able to get the entity from the db. then we pass
        //ity to the remove method of entityManager
        Person person = findById(id);
         entityManager.remove(person);
    }

    public List<Person> findAll(){
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
     }
}