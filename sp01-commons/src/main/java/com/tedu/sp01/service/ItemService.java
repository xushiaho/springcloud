package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * @program: springcloud
 * @author: 许仕昊
 * @create: 2019-10-19 14:55
 **/

public interface ItemService {
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);
}
