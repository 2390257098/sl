package cn.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SlZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlZuulApplication.class, args);
    }

}

