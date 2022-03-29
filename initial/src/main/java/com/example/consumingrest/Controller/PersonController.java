package com.example.consumingrest.Controller;

import com.example.consumingrest.Model.Person;
import com.example.consumingrest.Service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {
        return new ResponseEntity<Person>(personService.savePerson(person), HttpStatus.CREATED);
    }
}
