package com.wkingdev.springoasdocs.docs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class BookControllerTest extends BaseControllerTest {

    BookResultFilters bookResultFilters;

    @BeforeEach
    void setUp() {
        bookResultFilters = new BookResultFilters();
    }
    
    @Test
    void readBook() {
        RestAssured
                .given(this.spec)
                .baseUri("http://localhost")
                .contentType(ContentType.JSON)
                .pathParam("id", "5")
                .filter(bookResultFilters.readBookSuccessFilter())
                .when()
                .get("/books/{id}")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("author", Matchers.equalTo("WKingDev"))
                .body("uuid", Matchers.equalTo("018nv881-10fm-84nf-82mz-001mf98j02j9"));
    }

    @Test
    void readAllBooks() {
        RestAssured
                .given(this.spec)
                .baseUri("http://localhost")
                .contentType(ContentType.JSON)
                .filter(bookResultFilters.readAllBooksSuccessFilter())
                .when()
                .get("/books")
                .then()
                .statusCode(HttpStatus.OK.value());
    }

}