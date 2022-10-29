package com.example.tanhuan.order.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * 
 * @TableName order
 */
@TableName(value ="order")
@Data
public class Order implements Serializable {
    /**
     * 订单id
     */
    @TableId(value = "order_id",type = IdType.AUTO)
    private Integer orderId;

    /**
     * 订单编码
     */
    private String orderCode;

    /**
     * 订单数量
     */
    private String orderNum;

    /**
     * 订单名称
     */
    private String orderName;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 预留字段
     */
    private String flag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}