package com.example.demo.dto;

import lombok.Data;

@Data
public class RequestV2 extends RequestDto {
    private String name;

//    @Override
//    public int getVersion() {
//        return 2;
//    }
}