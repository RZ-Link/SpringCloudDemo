package org.example.order.controller;

import org.example.order.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/api/v1")
public class OrderController {

    @Autowired
    private ProductFeignClient productFeignClient;

    @GetMapping("/testFeign")
    public String testFeign() {
        return productFeignClient.hello();
    }
}
