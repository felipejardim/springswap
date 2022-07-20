package com.felipejardim.StarWars.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Eye_color")
public class EyeColor {

    @EmbeddedId
    EyeColorKey id;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("colorId")
    @JoinColumn(name = "Color_idColor")
    @JsonBackReference("eyeColor")
    Color color;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("peopleId")
    @JoinColumn(name = "People_idPeople")
    @JsonBackReference("eyeRef")
    People people;
}
