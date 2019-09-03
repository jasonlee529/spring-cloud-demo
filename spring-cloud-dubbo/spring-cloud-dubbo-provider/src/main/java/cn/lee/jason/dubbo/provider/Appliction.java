package cn.lee.jason.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class Appliction {

    public static void main(String[] args) {
        SpringApplication.run(Appliction.class, args);
    }


}