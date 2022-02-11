package com.example.swaggercodegen.ciscript;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.File;
import java.nio.charset.StandardCharsets;

@SpringBootTest
public class ExportSpecFile {

    @Autowired
    WebApplicationContext context;

    @Test
    public void generateOasFile() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(context).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/v3/api-docs.yaml"))
                .andDo(result -> FileUtils.write(
                        new File("swagger.yaml"),
                        new String(result.getResponse().getContentAsByteArray(), StandardCharsets.UTF_8),
                        StandardCharsets.UTF_8));
    }

}
