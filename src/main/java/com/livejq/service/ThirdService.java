package com.livejq.service;

import org.springframework.stereotype.Service;

/**
 * 模拟调用三方业务类，由于其涉及第三方组件，为避免对测试结果
 * 产生影响，可使用mock模拟其返回的结果
 */
@Service
public class ThirdService {

    public String thirdService() {
        return "第三方竭诚为您服务~";
    }
}
