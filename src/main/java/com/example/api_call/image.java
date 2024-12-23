package com.example.api_call;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record image (String id, String url, int width, int height, List<String> breeds, Map<String, Object> favourite){

}
