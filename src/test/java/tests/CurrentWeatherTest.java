package tests;

import com.jayway.restassured.response.Response;
import logic.CurrentWeather;
import logic.Responses;
import logic.StatusCode;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.http.ContentType.JSON;
import static org.hamcrest.core.IsEqual.equalTo;

public class CurrentWeatherTest {

private static final String BASE_PATH = "/current";
StatusCode sc = new StatusCode();

    @AfterClass
    public void clean(){
    }
    @Test
public void requestWithCorrectQuery(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "request.query",
                "Kiev, Ukraine"
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }
@Test
    public void requestWithCorrectQueryAndLetterAtEnd(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev" + "t");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "error.type",
                sc.returnCode(615)
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }
    @Test
    public void requestWithCorrectQueryAndUpLetterAtEnd(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev" + "T");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "request.query",
                "Kiev, Ukraine"
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }
    @Test
    public void requestWithCorrectQueryAndPosNum(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev" + "11");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "request.query",
                "Kiev, Ukraine"
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }
    @Test
    public void requestWithCorrectQueryAndNegNum(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev" + "-10");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "request.query",
                "Kiev, Ukraine"
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }
    @Test
    public void requestWithCorrectQueryAndSpace(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev" + " ");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "request.query",
                "Kiev, Ukraine"
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }
    @Test
    public void requestWithCorrectQueryTwoCityCrossSemicolon(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev;London");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "error.type",
                sc.returnCode(604)
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }

    @Test
    public void requestWithCorrectQueryTwoCityCrossSpace(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev London");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "request.query",
                "Kiev, Russia"
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }

    @Test
    public void requestWithCorrectQueryTwoCityCrossColon(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Kiev:London");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "request.query",
                "Kiev, Russia"
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }

    @Test
    public void requestWithCorrectQueryTwoCountriesCrossSemilicon(){
        Responses rs = new Responses();
        CurrentWeather cw = new CurrentWeather("Ukraine;Russia");
        String jsonBody =   rs.responseStatusCheck(
                BASE_PATH,
                cw.ACCESS_KEY,
                200,
                cw.getQueryParameters(),
                "error.type",
                sc.returnCode(604)
        )
                .getBody().asString();
        System.out.println(jsonBody);
    }


}
