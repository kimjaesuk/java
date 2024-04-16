package main.java.com.ohgiraffers.secttion01.method;

public class Application01 {

    public static void main (String[] args){
        /*
         * 메소드
         * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         * */

        System.out.println("maim() 시작됨....");

        Application01 app1 = new Application01();
        //래퍼런스 타입 : (참조하다)
         app1.methodA();

        System.out.println("maim() 종료됨..");
       // app1.main();
        // . = 참조연산자
    }

    public void methodA(){
        // 퍼블릭 : 접근제어자 // 보이드 : 반환타입이 없는거 // 메소드()먼저열고 {}범위 설정
        System.out.println("methodA() 시작됨");
        methodB();
        System.out.println("methodA() 종료됨");

    }

    public void methodB() {
        System.out.println("methodB() 시작됨");
        methodC();
        System.out.println("methodB() 종료됨");
    }

        public void methodC(){
            System.out.println("methodC() 시작됨");
            System.out.println("methodC() 종료됨");
        }


    }
