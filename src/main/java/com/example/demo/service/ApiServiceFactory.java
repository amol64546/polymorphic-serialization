package com.example.demo.service;

import com.example.demo.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class ApiServiceFactory {

  private final Map<String, ApiService<? extends RequestDto>> serviceMap;

  @SuppressWarnings("unchecked")
  public <T extends RequestDto> ApiService<T> getService(int version) {
    String key = "v" + version;
    ApiService<T> service = (ApiService<T>) serviceMap.get(key + "_api_service");
    if (service == null) {
      throw new IllegalArgumentException("No service found for version: " + version);
    }
    return service;

  }
}