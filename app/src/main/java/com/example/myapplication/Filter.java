package com.example.myapplication;

public class Filter {
    private String name;
    private String desc;
    private  int imageID;

    public static final Filter[] filter={
            new Filter("Filter","This is the description of Filter",R.drawable.cofee1)
    };

    public Filter(String name, String desc, int imageID){

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