package com.ohgiraffers.section03.copy;

public class Applition01 {
    public static void main(String[] args) {
    String[] goldSideNames = {"김재석","송재희","황정한"};
    String[] names = goldSideNames;
    goldSideNames[0] = "김효주";
    System.out.println(goldSideNames);
    System.out.println(names);

    goldSideNames[0] = "김효주";
    System.out.println(goldSideNames[0]);
    System.out.println(names[0]);
    System.out.println("-----------깊은복사--------");
    // 얕은 복사는 주소값만 복사 (김재석 -> 김효주로 변경)

        //ㅡㅡㅡㅡ 깊은복사의 개념ㅡㅡㅡㅡ
        goldSideNames = new String[]{"김재석","송재희","황정한"};
        names = new String[3];
        int i = 0;                                                        // 변수명을 새롭게 할당하는것이 불편해서 임시로 재사용
        for(String name : goldSideNames){
            names[i] = name;
            i++;                                                                  // for each  String 기본값 null
        }
        for(String name : names){
        goldSideNames[0] = "이상우";
        System.out.println(goldSideNames[0]);
        System.out.println(names[0]);
        }
    }
}
