package com.example.swaggercodegen.controllers;

import com.example.swaggercodegen.responses.SampleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleRestController {

    @GetMapping
    SampleResponse getResponse() {
        return new SampleResponse(1, "Sample Name");
    }
}
