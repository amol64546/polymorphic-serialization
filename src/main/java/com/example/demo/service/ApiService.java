package com.example.demo.service;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;

public interface ApiService<T extends RequestDto> {
    ResponseDto processRequest(T requestDTO);
}
