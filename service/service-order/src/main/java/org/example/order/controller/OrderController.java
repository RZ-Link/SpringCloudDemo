package org.example.order.controller;

import org.example.order.entity.User;
import org.example.order.feign.ProductFeignClient;
import org.example.order.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<User> testMybatisPlus() {
        return userMapper.selectList(null);
    }
}
