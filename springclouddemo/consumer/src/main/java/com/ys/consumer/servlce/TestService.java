package com.ys.consumer.servlce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;
    private static final String URL = "http://provider/hello";

    public String callHello(){
        return restTemplate.getForObject(URL,String.class);
    }
}
