package cn.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SlProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlProvideApplication.class, args);
    }

}

