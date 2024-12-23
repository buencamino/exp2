package com.example.api_call;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class apiService {
    @Resource
    private RestTemplate restTemplate;

    @Autowired
    public apiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getIP(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}
