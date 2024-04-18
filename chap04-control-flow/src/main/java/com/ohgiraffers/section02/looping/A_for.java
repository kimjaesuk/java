package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    //   * [for문 표현식]
    // * for(초기식; 조건식; 증감식){
    // *  // 조건식이 참인 경우 실행할 구문 == 반복할 구문
    //* }
    //*/
    public void gugudan() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i * j);
            }

        }
    }

    public void gugudanTwo() {
        int i = 2;
        for (int j = i; j <= 9; j++) {// 7 % 2 == 0
            if (j % i == 0) //
                for (int y = 2; y <= 9; y++) {
                    System.out.println(j + "*" + y + "=" + j * y);
                }
        }
    }

    // 10명의 이름과 나이를 입력받아 화면에 출력하기
    // ex) 이름:000 나이 00
    // 1. 입력값 공간을 만든다.
    // 2. 이름 10개 넣기
    // 3. 나이 10개 넣기
    public void inputinfo(){
        for(int i= 1; i<11; i++){
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int age = sc.nextInt();
            System.out.println("이름: "+name+"age"+age);
        }
    }


}