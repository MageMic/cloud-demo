package com.jgw.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = HiHystrix.class)
public interface ScheduleServiceHi {
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam String name);
}
