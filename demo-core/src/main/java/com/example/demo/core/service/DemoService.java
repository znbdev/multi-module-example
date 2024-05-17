package com.example.demo.core.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String getRuntimeTimes() {
        // 使用纳秒取得时间 START
        long dbStartTime = System.nanoTime();
        // 使用纳秒取得时间 END
        long dbEndTime = System.nanoTime();
        long dbDurationNano = (dbEndTime - dbStartTime);
        String runtimeTimes = "程序执行时间：" + dbDurationNano + " 纳秒";

        return runtimeTimes;
    }
}