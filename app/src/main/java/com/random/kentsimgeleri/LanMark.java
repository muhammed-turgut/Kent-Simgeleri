package com.random.kentsimgeleri;

import java.io.Serializable;

public class LanMark implements Serializable {

    String name;
    String Ulke;
    int image;

    public  LanMark(String name, String Ulke, int image ){
        this.name= name;
        this.Ulke=Ulke;
        this.image=image;
    }


}
