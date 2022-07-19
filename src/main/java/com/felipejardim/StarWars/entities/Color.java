package com.felipejardim.StarWars.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name="Color")
public class Color {

    @Id
    @Column(name = "idColor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColor;

    @Basic
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "color")
    @JsonManagedReference
    private List<EyeColor> eyeColor;

    @OneToMany(mappedBy = "color")
    @JsonManagedReference
    private List<SkinColor> skinColors;

    @OneToMany(mappedBy = "color")
    @JsonManagedReference
    private List<HairColor> hairColors;

}
