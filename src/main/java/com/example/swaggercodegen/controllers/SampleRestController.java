package com.example.swaggercodegen.controllers;

import com.example.swaggercodegen.requests.SampleRequest;
import com.example.swaggercodegen.responses.SampleResponse;
import com.example.swaggercodegen.responses.UserResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("sample")
public class SampleRestController {

    @Operation(summary = "サンプルgetAPIの概要です",
    tags = {},
    security = {},
    responses = {
            @ApiResponse(
               content = @Content(mediaType = "application/json",
                       schema = @Schema(implementation = SampleResponse.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception") }
)
    @GetMapping
    SampleResponse getResponse() {
        return new SampleResponse(1, new UserResponse("Sample Name", "aaa@bbb.com"));
    }

    
    @Operation(summary = "サンプルpostAPIの概要です",
        tags = {},
        security = {},
        responses = {
            @ApiResponse(responseCode = "200",description = "200コードの説明"),
            @ApiResponse(responseCode = "400", description = "400コードの説明"),
            @ApiResponse(responseCode = "403", description = "403コードの説明"),
            @ApiResponse(responseCode = "404", description = "404コードの説明") 
        })
    @PostMapping
    void postRequest(@RequestBody(
                        description = "リクエスト説明", 
                        required = true, 
                        content = @Content(schema = @Schema(implementation = SampleRequest.class))) SampleRequest sampleRequest) {
    }
}
