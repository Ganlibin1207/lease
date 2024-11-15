package com.glb.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.glb.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}
