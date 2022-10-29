package com.example.tanhuan.stock.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.tanhuan.stock.pojo.Stock;
import com.example.tanhuan.stock.service.StockService;
import com.example.tanhuan.stock.mapper.StockMapper;
import org.springframework.stereotype.Service;

/**
* @author 86152
* @description 针对表【stock】的数据库操作Service实现
* @createDate 2022-10-29 10:54:58
*/
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock>
    implements StockService{

}




