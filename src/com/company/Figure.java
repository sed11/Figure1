package com.company;

public abstract class Figure {
    private String name;
    public String getName(){return name;}
    protected void setName(String name){this.name = name;}
public abstract double getSquare();
    public  abstract double getPerimeter();
}
