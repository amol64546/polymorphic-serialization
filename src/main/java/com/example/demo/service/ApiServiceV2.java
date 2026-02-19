package com.example.demo.service;

import com.example.demo.dto.RequestV2;
import com.example.demo.dto.ResponseDto;
import com.example.demo.dto.ResponseV2;
import com.example.demo.dto.UpdateDto;
import org.springframework.stereotype.Service;

@Service("v2_api_service")
public class ApiServiceV2 implements ApiService<RequestV2, UpdateDto> {

    @Override
    public ResponseV2 processRequest(RequestV2 requestDTO) {
        System.out.println(requestDTO.getName());
        ResponseV2 response = new ResponseV2();
        response.setName("Hello, v2 " + requestDTO.getName() + "!");
        return response;
    }

    @Override
    public ResponseDto processUpdate(UpdateDto updateDTO) {
        return null;
    }
}