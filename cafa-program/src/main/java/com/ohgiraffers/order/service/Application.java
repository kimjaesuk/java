package com.ohgiraffers.order.service;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Scanner를 만들어 사용자 입력을 하게 만든다
        OrderController orderController = new OrderController();
        // OrderController 객체에서 주문기능을 한다
        boolean order = true;
        // 주문이 참일 경우 계속 진행할지 여부를 묻는다.
        String result = "";
        // 주문결과를 저장하는 "" 변수

        while(order){
            System.out.println("시작");
            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠나요? ");
            int input = sc.nextInt();
            sc.nextLine(); // 이전에 저장된 값을 지우기

            switch (input){
                case 1 : // 주문등록
                    System.out.print("몇개의 음료를 주문하시겠나요? : ");
                    int cnt = sc.nextInt();
                    sc.nextLine();
                    OrderDTO[] orders = new OrderDTO[cnt];
                    // 주문할 음료 정보를 배열한다
                    for (int i = 0; i < orders.length; i++) {
                        System.out.print("주문할 메뉴 이름을 등록해주세요 : ");
                        String menuName = sc.nextLine();
                        System.out.println("수량을 입력해주세요 :");
                        int quantity = sc.nextInt();
                        System.out.println("가격을 입력해주세요 : ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        orders[i] = new OrderDTO(menuName, quantity, price);
                        // 정보를 OrderDTO에 저장하고 생성하여 배열로 저장한다.
                    }
                    result = orderController.order(orders); // 주문 처리후 결과를 result에 넣는다.

                    break;

                case 2 : // 주문삭제
                    System.out.println("삭제할 주문의 개수를 입력해주세요: ");
                    int orderDeleteCount = sc.nextInt();
                    sc.nextLine();
                    int[]orderNumbers = new int[orderDeleteCount];
                    // 삭제할 주문 번호를 저장할 배열을 만든다.
                    for (int i = 0; i < orderDeleteCount; i++) {
                        System.out.println("삭제할 주문 번호를 입력해주세요: ");
                        orderNumbers[i] = sc.nextInt();
                        sc.nextLine();// 남아있는 정보 지우기
                    }
                    result = orderController.orderDelete(orderDeleteCount);
                    // result 값에 저장하고 치환하기
                    break;

                case 3 : // 주문 수정
                    System.out.println("수정할 주문 번호를 입력해주세요: ");
                    orderController.orderModify(); // 주문을 수정하는 메서드를 호출

                    break;

                case 4 : // 주문 상세조회
                    System.out.println(orderController.orderRead());
                    System.out.println("상세 조회할 제품 번호를 입력해주세요");
                    int num = sc.nextInt();
                    sc.nextLine();
                    result = orderController.orderDetail(num);
                    break;

                case 5 :// 주문 전체조회
                    result = orderController.orderRead();
                    break;

                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);

            System.out.print("주문을 종료하시겠나요?");
            order = sc.nextBoolean();
        }

        result = orderController.orderRead();
        System.out.println(result);

        System.out.print("주문을 종료하시겠나요?");
        order = sc.nextBoolean();
        System.out.print("주문종료 ==> " + order);
        }

    }
