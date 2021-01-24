package com.example.myapplication;

public class Drinks {
    private String name;
    private String desc;
    private  int imageID;

    public static final Drinks[] drinks={
            new Drinks("latte","This is the description of latte",R.drawable.coffee3),

    };

    public Drinks(String name, String desc, int imageID){

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
