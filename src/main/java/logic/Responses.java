package logic;

import com.jayway.restassured.response.Response;

import java.sql.Struct;
import java.util.HashMap;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class Responses {
    public static final String BASE_URI = "http://api.weatherstack.com";

    public static Response responseStatusCheck (String path, String access_key, int statusCode, HashMap queryParameters, String expectedPath, String expectedValue){

        Response response =  given()
                .baseUri(BASE_URI)
                .queryParameters(queryParameters)
                .when()
                .get(path)
                .then()
                .statusCode(statusCode)
                .body(expectedPath,equalTo(expectedValue))
                .extract()
                .response();
        return response;
    }
/*
    public static Response responseNegativeStatusCheck (String path, String access_key, int statusCode, HashMap queryParameters){
        StatusCode sc = new StatusCode();
        Response response =  given()
                .baseUri(BASE_URI)
                .queryParameters(queryParameters)
                .when()
                .get(path)
                .then()
                //.statusCode(statusCode)
                .body("error.type",equalTo(sc.returnCode(statusCode)))
                .extract()
                .response();
        return response;
    }*/
}
