package com.lovecoding.mapper;

import com.lovecoding.pojo.Order;
import com.lovecoding.pojo.OrderAndUser;

import java.util.List;

public interface OrderMapper {

    List<OrderAndUser> getOrderList();

    List<Order> getOrderList1();
}
