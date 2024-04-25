package com.ohgiraffers.section01.init;

public class Car {
    private String modelName;
    private  int Maxspeed;
    public Car(String modelName, int Maxspeed) {
        this.modelName = modelName;
        this.Maxspeed = Maxspeed;
    }

    public void driveMaxSpeed(){
        System.out.println(modelName + "이 최고시속"+Maxspeed+ "km/h로 달려갑니다");
    }
}
