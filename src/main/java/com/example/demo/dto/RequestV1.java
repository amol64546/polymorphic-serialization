package com.example.demo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RequestV1 extends RequestDto {
    private String name;

//    @Override
//    public int getVersion() {
//        return 1;
//    }
}