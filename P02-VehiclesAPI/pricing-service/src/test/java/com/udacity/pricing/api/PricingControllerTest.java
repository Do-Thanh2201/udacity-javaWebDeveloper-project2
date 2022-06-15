package com.udacity.pricing.api;

import com.udacity.pricing.domain.price.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class PricingControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;
    @Test
    public void getPrice() throws Exception {

        /**
         * TODO: Add a test to check that the `get` method works by calling
         *
         */
        ResponseEntity<Price> response =
                this.testRestTemplate.getForEntity("http://localhost:"+ 8082 + "/services/price/1", Price.class);

        response.hasBody();
    }
}
