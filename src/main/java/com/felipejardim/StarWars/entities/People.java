package com.felipejardim.StarWars.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name="People")
public class People {

    @Id
    @Column(name = "idPeople")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPeople;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "height")
    private Float height;

    @Basic
    @Column(name = "mass")
    private Float mass;

    @DateTimeFormat
    @Column(name = "created")
    private Date created;

    @DateTimeFormat
    @Column(name = "edited")
    private Date edited;

    @Basic
    @Column(name = "url")
    private String url;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Gender_idgender")
    @JsonBackReference("genderRef")
    private Gender gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "birth_year_idbirth_year", referencedColumnName = "idbirth_year")
    @JsonBackReference("birthRef")
    private BirthYear birthYear;

    @OneToMany(mappedBy = "people")
    @JsonManagedReference("eyeRef")
    private List<EyeColor> eyeColors;

    @OneToMany(mappedBy = "people")
    @JsonManagedReference("skinRef")
    private List<SkinColor> skinColors;

    @OneToMany(mappedBy = "people")
    @JsonManagedReference("hairRef")
    private List<HairColor> hairColors;

}
