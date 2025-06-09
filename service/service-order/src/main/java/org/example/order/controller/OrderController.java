package org.example.order.controller;

import org.example.order.feign.ProductFeignClient;
import org.example.order.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/api/v1")
public class OrderController {

    @Autowired
    private ProductFeignClient productFeignClient;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/testFeign")
    public String testFeign() {
        return productFeignClient.hello();
    }

    @GetMapping("/testMybatisPlus")
    public String testMybatisPlus() {
        System.out.println(userMapper.selectList(null));
        System.out.println(userMapper.selectUsers(1L));
        return "";
    }

}
