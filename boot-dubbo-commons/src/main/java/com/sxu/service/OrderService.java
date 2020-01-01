package com.sxu.service;

import com.sxu.entity.Order;

import java.util.List;

/**
 * @author jyw
 * @date 2020/1/1-17:48
 */
public interface OrderService {

    List<Order> findByUserId(Integer id);
}
