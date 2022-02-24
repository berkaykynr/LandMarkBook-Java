package com.berkay.landmarkbookjava;

import java.io.Serializable;

public class LandMark implements Serializable {
    String name;
    String location;
    int image;

    //Constructar

    public LandMark (String name, String location ,int image){
        this.name = name;
        this.location = location;
        this.image = image;
    }

}
