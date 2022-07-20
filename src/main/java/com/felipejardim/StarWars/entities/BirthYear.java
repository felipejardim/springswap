package com.felipejardim.StarWars.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name="Birth_Year")
public class BirthYear {

    @Id
    @Column(name = "idbirth_year")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBirthYear;

    @Basic
    @Column(name = "year")
    private Long year;

    @Basic
    @Column(name = "era")
    private String era;

    @OneToOne(mappedBy = "birthYear")
    @JsonManagedReference("birthRef")
    private People people;
}
