package com.felipejardim.StarWars.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Hair_color")
public class HairColor {

    @EmbeddedId
    HairColorKey id;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("colorId")
    @JoinColumn(name = "Color_idColor")
    @JsonBackReference
    Color color;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("peopleId")
    @JoinColumn(name = "People_idPeople")
    @JsonBackReference
    People people;
}
