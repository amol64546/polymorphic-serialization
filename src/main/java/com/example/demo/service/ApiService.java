package com.example.demo.service;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;
import com.example.demo.dto.UpdateDto;

public interface ApiService<T extends RequestDto, U extends UpdateDto> {
    ResponseDto processRequest(T requestDTO);

    ResponseDto processUpdate(U updateDTO);
}
