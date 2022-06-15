package com.udacity.vehicles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehiclesApiApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Configuration
    class RestTemplateConfig {

        // Create a bean for restTemplate to call services
        @Bean
        @LoadBalanced // Load balance between service instances running at different ports.
        public TestRestTemplate testRestTemplate() {
            return new TestRestTemplate();
        }
    }
}
