package com.huazai.springboot.annotion;

import org.springframework.stereotype.Component;

/**
 * Created by pyh on 2019/5/27.
 */
@Component
public class BMWCar implements Car {
    @Override
    public void printInfo() {
        System.out.println("我是一辆宝马");
    }
}
