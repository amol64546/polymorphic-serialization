package com.example.demo.service;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.UpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class ApiServiceFactory {

  private final Map<String, ApiService<? extends RequestDto, ? extends UpdateDto>> serviceMap;

  @SuppressWarnings("unchecked")
  public <T extends RequestDto, U extends UpdateDto> ApiService<T, U> getService(int version) {
    String key = "v" + version;
    ApiService<T, U> service = (ApiService<T, U>) serviceMap.get(key + "_api_service");
    if (service == null) {
      throw new IllegalArgumentException("No service found for version: " + version);
    }
    return service;

  }
}