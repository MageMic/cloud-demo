package com.jgw.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
