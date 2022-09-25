package com.wkingdev.springoasdocs.docs;

import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.restdocs.restassured3.RestDocumentationFilter;

import static com.epages.restdocs.apispec.RestAssuredRestDocumentationWrapper.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;

public class BookResultFilters {

    public RestDocumentationFilter readBookSuccessFilter() {
        return document("책 단일 조회",
                responseFields(
                        fieldWithPath("id").type(JsonFieldType.NUMBER).description("책 아이디"),
                        fieldWithPath("title").type(JsonFieldType.STRING).description("제목"),
                        fieldWithPath("author").type(JsonFieldType.STRING).description("작가"),
                        fieldWithPath("uuid").type(JsonFieldType.STRING).description("일련 번호"),
                        fieldWithPath("description").type(JsonFieldType.STRING).description("설명").optional(),
                        fieldWithPath("createdAt").type(JsonFieldType.STRING).description("생성 일시"),
                        fieldWithPath("updatedAt").type(JsonFieldType.STRING).description("수정 일시")
                )
        );
    }

    public RestDocumentationFilter readAllBooksSuccessFilter() {
        return document("책 전체 조회",
                responseFields(
                        fieldWithPath("[].id").type(JsonFieldType.NUMBER).description("책 아이디"),
                        fieldWithPath("[].title").type(JsonFieldType.STRING).description("제목"),
                        fieldWithPath("[].author").type(JsonFieldType.STRING).description("작가"),
                        fieldWithPath("[].uuid").type(JsonFieldType.STRING).description("일련 번호"),
                        fieldWithPath("[].description").type(JsonFieldType.STRING).description("설명").optional(),
                        fieldWithPath("[].createdAt").type(JsonFieldType.STRING).description("생성 일시"),
                        fieldWithPath("[].updatedAt").type(JsonFieldType.STRING).description("수정 일시")
                )
        );
    }

}
