package com.ohgiraffers.section03.abstraction.problem3;

public class Application01 {
    public static void main(String[] args){
        Car ram = new Car();
        ram.setName("람보르기니");
        Car po= new Car();
        po.setName("포르쉐");

        CarRacer kim = new CarRacer();

        kim.starup(ram);
        kim.go(ram);
        kim.stop(ram);
        kim.turnoff(ram);

    }
}
