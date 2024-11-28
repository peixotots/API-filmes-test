package com.adatech.filmesAPI.restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpHeaders;

public class RestAssuredUtil {

    public static RequestSpecification producoes(){
        return RestAssured.given()
                .baseUri("http://localhost:8080")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header(HttpHeaders.AUTHORIZATION, "Basic YW5hQGVtYWlsLmNvbTpzZW5oYTE=");
    }

    public static void main(String[] args) {
        var response = RestAssured.given()
                .baseUri("http://localhost:8080")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header(HttpHeaders.AUTHORIZATION, "Basic YW5hQGVtYWlsLmNvbTpzZW5oYTE=")
                .get("/usuarios/nome?nome=Ana");

        response.prettyPrint();
        response.then().statusCode(200);
    }
}
