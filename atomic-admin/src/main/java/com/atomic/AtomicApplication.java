package com.atomic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author atomic
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.atomic.*.mapper")
public class AtomicApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(AtomicApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Atomic启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}