package com.example.user.lists.models;

/**
 * Created by User on 10/8/2016.
 */

public class ViewPagerModel{

    String title = "";
    String desc = "";
    int Image;

    public ViewPagerModel(String title,String desc,int Image) {
        this.title = title;




        this.desc = desc;
        this.Image= Image;
    }

    public int getImage() {
        return Image;
    }

    public String getDesc() {

        return desc;
    }

    public String getTitle() {

        return title;
    }
//private int id=0;
//    private String name="Cygins Media";
//    private String basedOn = "USA";
//    private String foundation = "2010-06-05";
//    private String description = "Cygins Media is Software House";
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getBasedOn() {
//        return basedOn;
//    }
//
//    public String getFoundation() {
//        return foundation;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public ViewPagerModel(int id, String name, String basedOn, String foundation, String description) {
//        this.id = id;
//        this.name = name;
//        this.basedOn = basedOn;
//        this.foundation = foundation;
//        this.description = description;
//    }
//    public ViewPagerModel(){
//        super();
//    }
}
