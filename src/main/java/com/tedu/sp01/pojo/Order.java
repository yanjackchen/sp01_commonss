package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author chen
 * @date 2019/11/27 9:53
 * @Email chenyjgogo@aliyun.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private User user;
    private List<Item> items;
}
