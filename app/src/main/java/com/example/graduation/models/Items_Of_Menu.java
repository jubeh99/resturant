package com.example.graduation.models;

public class Items_Of_Menu {
    private int image;
    private String name;
    private String prise;


    public String getPrise() {
        return prise;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Items_Of_Menu(int image, String name, String prise) {
        this.image = image;
        this.name = name;
        this.prise = prise;
    }
}
