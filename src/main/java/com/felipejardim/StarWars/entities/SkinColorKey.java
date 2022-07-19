package com.felipejardim.StarWars.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SkinColorKey implements Serializable {
    @Column(name = "Color_idColor")
    Long colorId;

    @Column(name = "People_idPeople")
    Long peopleId;
}
