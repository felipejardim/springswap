package com.felipejardim.StarWars.services;

import com.felipejardim.StarWars.entities.People;
import com.felipejardim.StarWars.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    public List<People> listCharacters(){
        return peopleRepository.findAll();
    }

    public People createCharacter(People people){
        people.setCreated(new Date());
        people.setEdited(null);
        return peopleRepository.save(people);
    }

}
