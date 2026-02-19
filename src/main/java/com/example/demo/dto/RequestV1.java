package com.example.demo.dto;

import lombok.Data;

@Data
public class RequestV1 implements RequestDto {
    private String name;

    @Override
    public int getVersion() {
        return 1;
    }
}