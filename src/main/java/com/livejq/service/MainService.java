package com.livejq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    private ThirdService thirdService;

    public void mainService() {
        System.out.println("这是需要测试的业务方法");
        String result = thirdService.thirdService();
        System.out.println("测试结果为：" + result);
    }
}
