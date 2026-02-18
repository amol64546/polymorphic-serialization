package com.example.demo.service;

import com.example.demo.dto.RequestV2;
import com.example.demo.dto.ResponseV2;
import org.springframework.stereotype.Service;

@Service("v2_api_service")
public class ApiServiceV2 implements ApiService<RequestV2> {

    @Override
    public ResponseV2 processRequest(RequestV2 requestDTO) {
        System.out.println(requestDTO.getName());
        ResponseV2 response = new ResponseV2();
        response.setName("Hello, v2 " + requestDTO.getName() + "!");
        return response;
    }
}