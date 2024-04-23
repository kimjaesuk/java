package com.ohgiraffers.section03.dto.problem1;

public class Application01 {
    public static void main(String[] args) {

        String name = "송재희";
        char gender ='여';
        int age = 20;
        String phone = "010-1234-5678";
        String address = "인사동";


        MenberRepository memberRepository = new MenberRepository();
        memberRepository.addMember(name,gender,age,address,phone);
        memberRepository.print();

        String name1 = "김재석";
        char gender1 ='남';
        int age1 = 19;
        String phone1 = "010-2323-2323";
        String address1 = "고잔동";
        memberRepository.addMember(name1,gender1,age1,address1,phone1);
        memberRepository.print();

    }

}
