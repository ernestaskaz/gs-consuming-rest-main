package com.example.consumingrest.Service;

import com.example.consumingrest.Model.Person;

import java.util.List;

public interface PersonService {

Person savePerson(Person person);
List<Person> getPeople();
}
