package com.felipejardim.StarWars.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Skin_color")
public class SkinColor {

    @EmbeddedId
    SkinColorKey id;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("colorId")
    @JoinColumn(name = "Color_idColor")
    @JsonBackReference("skinColor")
    Color color;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("peopleId")
    @JoinColumn(name = "People_idPeople")
    @JsonBackReference("skinRef")
    People people;
}
