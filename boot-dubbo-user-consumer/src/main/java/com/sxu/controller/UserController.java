package com.sxu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sxu.entity.Order;
import com.sxu.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jyw
 * @date 2020/1/1-18:29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private OrderService orderService;


    @GetMapping("/like/{id}")
    public List<Order> findOrderByUserId(Integer userId){
        List<Order> list = orderService.findByUserId(1);
        return list;
    }
}
