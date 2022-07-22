package com.learningSpring.demo.dao;

import com.learningSpring.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    //method to insert person with id
    int insertPerson(UUID id, Person person);
    //method to insert person without id
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    //to get all the person names
    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);
    //to update and delete
    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);
}
