package org.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("service-product")
public interface ProductFeignClient {

    @GetMapping("/product/api/v1/hello")
    String hello();
}
