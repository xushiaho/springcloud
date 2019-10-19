package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

/**
 * @program: springcloud
 * @author: 许仕昊
 * @create: 2019-10-19 14:58
 **/

public interface OrderService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}
