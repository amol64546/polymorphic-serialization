package com.example.demo.service;

import com.example.demo.dto.RequestV1;
import com.example.demo.dto.ResponseV1;
import org.springframework.stereotype.Service;

@Service("v1_api_service")
public class ApiServiceV1 implements ApiService<RequestV1> {

  @Override
  public ResponseV1 processRequest(RequestV1 requestDTO) {
    System.out.println(requestDTO.getName());
    ResponseV1 response = new ResponseV1();
    response.setName("Hello, v1 " + requestDTO.getName() + "!");
    return response;
  }
}