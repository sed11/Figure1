package com.company;

public class Parallelogram extends Figure{
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sinA;
public Parallelogram(double sideA,double sideB,double sideC,double sideD ,double sinA){
           setName("Параллелограм");
this.sideA = sideA;
this.sideB = sideB;
this.sideC = sideC;
this.sideD = sideD;
this.sideD = sinA;
}
public double getSideA () {return  sideA;}
public double getSideB () {return  sideB;}
public double getSideC () {return  sideC;}
public double getSideD () {return  sideD;}
public double getSinA () {return  sinA;}

public double getPerimeter (){return 2*(sideA + sideD);   }
public double getSquare() {
    return  sideA*sideD*sinA;


}
}





