package com.example.tanhuan.order.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.tanhuan.order.pojo.Order;


/**
* @author 86152
* @description 针对表【order】的数据库操作Service
* @createDate 2022-10-29 10:51:55
*/
public interface OrderService extends IService<Order> {

    void addOrder(Order order);
}
