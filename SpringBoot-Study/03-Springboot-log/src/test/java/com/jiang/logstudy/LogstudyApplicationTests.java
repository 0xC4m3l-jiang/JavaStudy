package com.jiang.logstudy;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
class LogstudyApplicationTests {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        // 日志的级别 由低到高
        // 调整日志级别
        logger.trace("这是trace 日志");
        logger.debug("这是debug 日志");
        // 默认为 info 级别 输出 Info 及其以上的级别日志
        logger.info("这是 info 日志");
        logger.warn("这是 warn 日志");
        logger.error("这只error 日志");
    }

}
