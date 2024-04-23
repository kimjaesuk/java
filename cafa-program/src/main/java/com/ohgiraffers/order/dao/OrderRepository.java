package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {
    ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO){

        int oldNum = orders.size();

        orders.add(orderDTO);

        if(oldNum >= orders.size()){
            return "등록 실패";
        }

        return "등록 성공";

    }
}
