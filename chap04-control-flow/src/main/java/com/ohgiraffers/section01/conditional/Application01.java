package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요.");

    }


    //  A_if aIf = new A_if();
    //  aIf.testSimpleIfStatemet();

    /*
     * 계산기 만들기
     * 두 수와 수식을 입력받아
     * 수식에 맞는 연산을 수행하는 프로그램을 만들어주세요
     * */
    /* 1. calculator 메서드를 만든다.
     * 2. 첫번째 수를 입력받는다.
     * 2-1 두번째 수를 입력받는다.
     * 3. 연산 기호를 입력받는다.
     * 4. 연산 기호를 확인한다.
     * 5. 연산을 진행한다.
     * 6. 반환한다
     * */

    public String calciuatoor() {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        char opreator = sc.next().charAt(0);
        double result;
        if (opreator == '+') {
            result = first + second;
        } else if (opreator == '-') {
            result = first - second;
        } else if (opreator == '*') {
            result = first * second;
        } else {
            result = first / second;
        }

        return 0.0;

    }

    public String call() {
        String input = sc.nextLine();
        String[] target = input.split ("");
        int result = 0;

        if(target[1].equals("+")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }
        String a = '1';
        String b = '2';
        return "" + result;

    }

}