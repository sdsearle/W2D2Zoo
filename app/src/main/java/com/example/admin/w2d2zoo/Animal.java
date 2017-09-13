package com.example.admin.w2d2zoo;

import android.text.Layout;

/**
 * Created by admin on 9/12/2017.
 */

public class Animal {
    String name, type;
    int age, weight;
    int layout, img1, img2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public Animal(String name, String type, int age, int weight, int img1, int img2) {

        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        int tmp = (int) ((Math.random()*3)+1);
        switch (tmp){
            case 1:
                this.layout = R.layout.custom_list_layout1;
                break;
            case 2:
                this.layout = R.layout.custom_list_layout2;
                break;
            default:
                this.layout = R.layout.custom_list_layout3;
                break;
        }

        this.img1 = img1;
        this.img2 = img2;

    }
}
