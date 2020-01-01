package com.sxu.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jyw
 * @date 2020/1/1-17:51
 */
@Data
public class Order implements Serializable {
    String orderId;
    BigDecimal totalPrice;
    Date createTime;
    Date updateTime;
}
