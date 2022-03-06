package com.example.swaggercodegen.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Value;

@Value
public class SampleRequest {

    @Schema(required = true, description = "idの説明", minimum = "1", maximum = "100")
    Integer id;

    @Schema(required = true, description = "userRequestの説明")
    UserRequest userRequest;
}
