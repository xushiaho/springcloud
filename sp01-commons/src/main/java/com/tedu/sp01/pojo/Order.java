package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: springcloud
 * @author: 许仕昊
 * @create: 2019-10-19 14:38
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private User user;
    private List<Item> items;
}
