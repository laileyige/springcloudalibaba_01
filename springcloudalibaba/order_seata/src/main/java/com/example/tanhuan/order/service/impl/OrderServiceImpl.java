package com.example.tanhuan.order.service.impl;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.tanhuan.order.pojo.Order;
import com.example.tanhuan.order.service.OrderService;
import com.example.tanhuan.order.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author 86152
* @description 针对表【order】的数据库操作Service实现
* @createDate 2022-10-29 10:51:55
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{
    @Autowired
    OrderMapper orderMapper;

    @GlobalTransactional
    public void addOrder(Order order) {
        orderMapper.insertOrder(order);
    }
}




