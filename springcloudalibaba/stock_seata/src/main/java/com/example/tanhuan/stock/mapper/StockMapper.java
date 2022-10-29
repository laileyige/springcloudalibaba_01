package com.example.tanhuan.stock.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.tanhuan.stock.pojo.Stock;
import org.springframework.stereotype.Repository;


/**
* @author 86152
* @description 针对表【stock】的数据库操作Mapper
* @createDate 2022-10-29 10:54:58
* @Entity com.example.tanhuan.stock.pojo.Stock
*/
@Repository
public interface StockMapper extends BaseMapper<Stock> {
    void insertStock(Stock stock);
}




