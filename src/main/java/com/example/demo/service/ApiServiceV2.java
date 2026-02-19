package com.example.demo.service;

import com.example.demo.dto.*;
import org.springframework.stereotype.Service;

@Service("v2_api_service")
public class ApiServiceV2 implements ApiService<RequestV2, UpdateV2> {

    @Override
    public ResponseV2 processRequest(RequestV2 requestDTO) {
        System.out.println(requestDTO.getName());
        ResponseV2 response = new ResponseV2();
        response.setName("Hello, v2 " + requestDTO.getName() + "!");
        return response;
    }

    @Override
    public ResponseDto processUpdate(UpdateV2 updateDTO) {
        System.out.println("Processing update for v2");
        ResponseV2 response = new ResponseV2();
        response.setName("Hello, v2 " + updateDTO.getName() + "!");
        return response;
    }
}