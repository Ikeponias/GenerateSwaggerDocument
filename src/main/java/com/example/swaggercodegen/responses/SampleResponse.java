package com.example.swaggercodegen.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Value;

@Value
public class SampleResponse {

    @Schema(description = "idの説明")
    Integer id;

    @Schema(description = "userResponseの説明")
    UserResponse userResponse;
}
