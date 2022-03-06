package com.example.swaggercodegen.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Value;

@Value
public class UserRequest {
    
    @Schema(description = "nameの説明", minLength = 1, maxLength = 100)
    String name;

    @Schema(required = true, description = "mailの説明", minLength = 1, maxLength = 50)
    String mail;
}
