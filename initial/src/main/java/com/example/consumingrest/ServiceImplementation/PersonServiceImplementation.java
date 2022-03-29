package com.example.consumingrest.ServiceImplementation;

import com.example.consumingrest.Model.Person;
import com.example.consumingrest.Repository.PersonRepository;
import com.example.consumingrest.Service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplementation implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImplementation(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getPeople() {
        return personRepository.findAll();
    }
}
