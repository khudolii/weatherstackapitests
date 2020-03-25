package logic;

import com.jayway.restassured.response.Response;

import java.util.HashMap;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static com.jayway.restassured.http.ContentType.JSON;
import static org.hamcrest.core.IsEqual.equalTo;

public class CurrentWeather extends QueryParameters  {

    public CurrentWeather(String query) {
        super(query);
    }

    public CurrentWeather(String query, String units, String language, String callback) {
        super(query, units, language, callback);
    }

}
