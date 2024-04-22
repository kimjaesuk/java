package com.ogiraffers.section02.problem1;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[3]; // book 이라는 class를 3개 를 가질 수 있는 묶음

        while(true){

            System.out.println("1 : 책 대여");
            System.out.println("2 : 책 반납");
            System.out.println("3 : 책 등록");
            System.out.println("4 : 회원등록");
            System.out.println("5 : 종료");
            int number = sc.nextInt();
            switch(number){
                case 1:
                    System.out.println("책대여");
                    break;
                case 2:
                    System.out.println("책반납");
                    break;
                case 3:
                    System.out.println("책등록");
                    break;
                case 4:
                    System.out.println("회원등록");
                    break;
                case 5:
                    System.out.println("종료");
                    break;
            }
        }

//        books[0].bookName ="first java";
//        books[1].bookName ="first c";
//        books[2].bookName ="first python";
//
//        books[0].bookAuthor = "Kim";
//        books[1].bookAuthor = "Lee";
//        books[2].bookAuthor = "Park";
//
//        books[0].bookNo = 0;
//        books[1].bookNo = 1;
//        books[2].bookNo = 2;

//        Human Song = new Human();
//        Song.Name = "Song jae hee";
//        Song.book = books[0];



    }
}