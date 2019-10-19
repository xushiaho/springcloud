package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springcloud
 * @author: 许仕昊
 * @create: 2019-10-19 14:37
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String  username;
    private String passwordd;
}
