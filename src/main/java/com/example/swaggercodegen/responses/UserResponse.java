package com.example.swaggercodegen.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Value;

@Value
public class UserResponse {
    
    @Schema(description = "nameの説明")
    String name;

    @Schema(description = "mailの説明")
    String mail;
}
