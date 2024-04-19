package com.ohgiraffers.section01.conditional;

//D_switch라는 클래를 모두가 사용할 수 있도록 만든다.

import java.util.Scanner;

public class D_switch {
    // 클래스 내부 속성

    // testSimpleSwitchStatement 라는 반환값이 없는 메서드를 모두 사용할 수 있도록 만든다.
   public void testSimpleSwitchStatement() {

   }
//        /*
//         * [switch문 표현식]
//         *  switch(비교대상값){
//         *      case 비교값 : 비교값이 참인 경우 실행할 구문; break;
//         *      case 비교값 : 비교값이 참인 경우 실행한 구문; break;
//         *      default : case에 모두 해당되지 않는 경우 ; break;
//         * }
//         * */
//        // 사용자한테 값을 입력받을 수 있는 객체를 생성함
//        Scanner sc = new Scanner(System.in);
//        // 화면에 첫번째 정수 입력 : 입력하라는 내용을 출력함
//        System.out.println("첫번째 정수 입력 : ");
//        // 사용자가 입력한 값을 fifst에 대입함
//        int first = sc.nextInt();
//        // 사용자의 화면에 두 번째 정수를 입력하라고 출력함
//        System.out.println("두번째 정수 입력 : ");
//        // 사용자가 입력한 값을 second라는 변수에 정수로 받아서 대입함
//        int second = sc.nextInt();
//        // 사용자가 입력한 연삭 기호를 입력하라고 출력함
//        System.out.println("연산 기호 입력");
//        // 사용자가 입력한 연산 기호를 문자로 받아서 op에 대입함
//        char op = sc.next().charAt(0);
//        //연산은 +,-,/,* 가 가능하며 이외에는 계산 불가능이라는 결과를 화면에 출력합니다
//        switch (op) { // op의 변수를 기준으로 아래의 값과 일치하는지 확인함
//
//            case '+': // op가 +와 같다면 frist+second 결과를 화면에 출력함
//                System.out.println(first += second);
//                break;
//            case '-': // op가 -와 같다면 first-second 결과를 화면에 출력함
//                System.out.println(first -= second);
//                break;
//            case '*': // op가 *와 같다면 frist*second 결과를 화면에 출력함
//                System.out.println(first *= second);
//                break;
//            case '/': // op가 /와 같다면 frist/second 결과를 화면에 출력함
//                System.out.println(first /= second);
//                break;
//            default:
//                // op가 위의 수식에 모두 만족하지 않으면 같지 않음을 출력함
//                System.out.println("같지않음");
//                break;
//        }


    }// testSimpleSwitch 메서드 종료

    // 계산기를 만들고 결과를 반환. (switch를 이용함) 반환된 결과는 Application02에서 출력해주세요.
    // + - / * 만 제공하고 일치하는 연산이 없는 경우 연산불가 라는 결과를 출력. -> 반환값을 0.0으로 합니다.

    // ★과정 짜기★
    // 1. 값을 입력받음
    // 2. 첫 수 입력받기
    // 3. 두 번째 수 입력
    // 4. 연산기호 입력
    // 5. 연산기호를 비교
    // 6. 반환

//    public double switchCalculator(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫 번째 정수 입력 : ");
//        int firstNum = sc.nextInt();
//
//        System.out.println("연산기호 입력 : ");
//        char opA = sc.next().charAt(0);
//
//        System.out.println("두 번째 정수 입력 : ");
//        int secondNum = sc.nextInt();
//
//        double result = 0.0;
//
//        switch (opA){
//            case '+' : System.out.println(result = firstNum + secondNum); break;
//            case '-' : System.out.println(result = firstNum - secondNum); break;
//            case '*' : System.out.println(result = firstNum * secondNum); break;
//            case '/' : System.out.println(result = firstNum / secondNum); break;
//            default: System.out.println("연산불가"); break;
//        }
//
//        return result;
//
//    }



//    public String switchCalculator(int result) {
//        if (result == 100) {
//            System.out.println(result + "점 입니다.A+ !");
//        } else if (result < 100 && result >= 90) {
//            System.out.println(result + "점 입니다. A !");
//        } else if (result < 90 && result >= 85) {
//            System.out.println(result + "점 입니다. B+ !");
//        } else if (result < 85 && result >= 75) {
//            System.out.println(result + "점 입니다. B !");
//        } else if (result < 75 && result >= 60) {
//            System.out.println(result + "점 입니다. C !");
//        } else if (result < 60) {
//            System.out.println("점 입니다. D !");
//        } else {
//            System.out.println("해당하는 성적이 없습니다.");
//        }
//        return "";
//    }



 // D_switch 의 종료
