package com.felipejardim.StarWars.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name="Gender")
public class Gender {

    @Id
    @Column(name = "idGender")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGender;

    @Basic
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "gender")
    @JsonManagedReference
    private List<People> people;

}
