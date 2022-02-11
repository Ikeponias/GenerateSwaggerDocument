package com.example.swaggercodegen.controllers;

import com.example.swaggercodegen.responses.SampleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleRestController {

    @Operation(summary = "サンプルレスポンス返却",
            description = "サンプルレスポンスを返却します",
            responses = {
                    @ApiResponse(responseCode = "200", description = "正常",
                            content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = SampleResponse.class)))})
    @GetMapping
    SampleResponse getResponse() {
        return new SampleResponse(1, "Sample Name");
    }
}
