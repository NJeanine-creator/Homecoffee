package com.example.myapplication;

public class Cappuccino {
    private String name;
    private String desc;
    private  int imageID;

    public static final Cappuccino[] cappuccino ={
            new Cappuccino("Cappuccino","This is the description of Cappuccino",R.drawable.coffee2),

    };

    public Cappuccino(String name, String desc, int imageID){

        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }
    public String getDesc(){
        return desc;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
    public String toString(){
        return this.name;
    }
}
