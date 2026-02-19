package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  property = "version",
  visible = true
)
@JsonSubTypes({
  @JsonSubTypes.Type(value = UpdateV1.class, name = "1"),
  @JsonSubTypes.Type(value = UpdateV2.class, name = "2")
})
@Data
public abstract class UpdateDto {
  private int version;
}
