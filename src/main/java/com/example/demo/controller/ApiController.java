package com.example.demo.controller;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.dto.UpdateDto;
import com.example.demo.service.ApiService;
import com.example.demo.service.ApiServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

  private final ApiServiceFactory apiServiceFactory;

  @Autowired
  public ApiController(ApiServiceFactory apiServiceFactory) {
    this.apiServiceFactory = apiServiceFactory;
  }

  @PostMapping("/create")
  public ResponseEntity<Object> createRequest(
    @RequestBody RequestDto requestDTO) {

    ApiService<RequestDto, UpdateDto> apiService = apiServiceFactory.getService(requestDTO.getVersion());

    // Call the correct service based on version
    ResponseDto response = apiService.processRequest(requestDTO);

    // The response is polymorphic and Jackson will handle the serialization
    return ResponseEntity.ok(response);
  }

  @PostMapping("/update")
  public ResponseEntity<Object> updateRequest(
    @RequestBody UpdateDto requestDTO) {

    ApiService<RequestDto, UpdateDto> apiService = apiServiceFactory.getService(requestDTO.getVersion());

    // Call the correct service based on version
    ResponseDto response = apiService.processUpdate(requestDTO);

    // The response is polymorphic and Jackson will handle the serialization
    return ResponseEntity.ok(response);
  }
}
