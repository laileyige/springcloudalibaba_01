package com.example.tanhuan.order.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.tanhuan.order.pojo.Order;
import org.springframework.stereotype.Repository;


/**
* @author 86152
* @description 针对表【order】的数据库操作Mapper
* @createDate 2022-10-29 10:51:55
* @Entity com.example.tanhuan.order.pojo.Order
*/
@Repository
public interface OrderMapper extends BaseMapper<Order> {

    void insertOrder(Order order);
}




