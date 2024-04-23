package com.ohgiraffers.section03.abstraction.problem3;

public class CarRacer {

    private Car car;

    public void starup(Car car){
        this.car.startUp();
    }
    public void turnoff(Car car){
        this.car.turnoff();
    }
    public  void go(Car car){
        this.car.go();
    }
    public void stop (Car car){
        this.car.stop();
    }

}


