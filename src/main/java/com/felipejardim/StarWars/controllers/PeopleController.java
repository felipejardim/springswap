package com.felipejardim.StarWars.controllers;

import com.felipejardim.StarWars.entities.People;
import com.felipejardim.StarWars.services.PeopleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people/")
public class PeopleController {

    PeopleService peopleService;

    @GetMapping("")
    @ResponseBody
    public List<People> listPeople(){
        return peopleService.listCharacters();
    }

    @PostMapping("")
    public People createPeople(@RequestBody People people){
        return peopleService.createCharacter(people);
    }

}
