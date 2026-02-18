package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  property = "version"
)
@JsonSubTypes({
  @JsonSubTypes.Type(value = RequestV1.class, name = "1"),
  @JsonSubTypes.Type(value = RequestV2.class, name = "2")
})
public interface RequestDto {

  int getVersion();

}