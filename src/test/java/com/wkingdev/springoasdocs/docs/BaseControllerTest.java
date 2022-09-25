package com.wkingdev.springoasdocs.docs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.restassured3.RestAssuredRestDocumentation.documentationConfiguration;

@SpringBootTest()
@ExtendWith(RestDocumentationExtension.class)
public class BaseControllerTest {

    protected static final String baseUri = "http://localhost/api/v1";
    protected RequestSpecification spec;

    @BeforeEach
    void setUpRestDocs(RestDocumentationContextProvider restDocumentation) {
        spec = new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .setPort(8080)
                .addFilter(documentationConfiguration(restDocumentation)
                        .operationPreprocessors()
                        .withRequestDefaults(prettyPrint())
                        .withResponseDefaults(prettyPrint())
                )
                .build();
    }

}