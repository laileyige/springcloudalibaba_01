package com.example.tanhuan.stock.pojo;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * 
 * @TableName stock
 */
@TableName(value ="stock")
@Data
public class Stock implements Serializable {
    /**
     * 订单id
     */
    @TableId
    private Integer stockId;

    /**
     * 订单数量
     */
    private String stockNum;

    /**
     * 订单名称
     */
    private String stockName;

    /**
     * 库存状态
     */
    private Integer status;

    /**
     * 预留字段
     */
    private String flag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}