package com.example.tanhuan.order.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.tanhuan.order.pojo.Order;
import com.example.tanhuan.order.service.OrderService;
import com.example.tanhuan.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 86152
* @description 针对表【order】的数据库操作Service实现
* @createDate 2022-10-29 10:51:55
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




