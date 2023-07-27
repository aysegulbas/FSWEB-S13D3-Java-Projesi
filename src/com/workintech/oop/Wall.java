package com.workintech.oop;

public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double setWidth(double number){//değer getirtmiyoruz değer ataması yapmadığımız için void yazfık, double da çalışıyor
        width=number;
        if(number<0){width=0;}
        return width;
    }
    public double setHeight(double number){
        height=number;
        if(number<0){height=0;}
        return height;
    }
    public double getArea(){
        return width*height;
    }
}
