package main.java.com.ohgiaffers.section04.overflow;

public class Application01 {

    public static void main(String[] args){

        // 자로형 별 값의 최대 범위를 벗어나는 경우 발생한 carry를 버림처리하고  sing bit를 반전시켜 최소값으로 순환시킴

            byte num1 = 127;
            System.out.println("byte num : " + num1);
            num1++;
            System.out.println("byte num : " + num1);


            int firstNum = 10000000;
            int secondNum = 70000000;
            int mulit =firstNum * secondNum;
            System.out.println("first num * seocndNum = " + mulit);

            long longMulti = firstNum * secondNum;
            System.out.println("firstNum * secondNum = " + longMulti);

            long resulf = (long) firstNum * secondNum;
            System.out.println("firstNum * secondNum = " + resulf);


    }
}
