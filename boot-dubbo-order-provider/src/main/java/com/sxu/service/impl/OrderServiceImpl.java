package com.sxu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sxu.entity.Order;
import com.sxu.service.OrderService;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author jyw
 * @date 2020/1/1-17:58
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> findByUserId(Integer id) {
        Order order = new Order();
        order.setOrderId("asdsadda123123412");
        order.setTotalPrice(new BigDecimal("101"));
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());

        return Collections.singletonList(order);

    }
}
