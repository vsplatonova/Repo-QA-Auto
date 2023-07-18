package api;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import specification.Specifications;
import java.util.concurrent.TimeUnit;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DonkiTest extends Specifications {
    @Test
    void getDonkiCME(){

        JsonPath response= given(requestSpecification)
                .queryParam("startDate", "2023-03-01")
                .queryParam("endDate", "2023-04-24")
                .when()
                .get("https://api.nasa.gov/DONKI/CME")
                .body()
                .jsonPath();
       response.prettyPrint();

    assertThat(response.get("cmeAnalyses[0].time21_5[0]"),equalTo("2023-03-01T16:05Z"));
    }
@Test
    void  getDONKIGeomagneticStorm(){

    given(requestSpecification)
            .queryParam("startDate", "2023-03-01")
            .queryParam("endDate", "2023-04-24")
            .when()
            .get("https://api.nasa.gov/DONKI/GST")
            .then()
            .statusCode(200)
            .header("Content-Type", "application/json")
            .extract()
            .body()
            .jsonPath();

}

@Test
    void getDONKIRadiationBeltEnhancement(){

    given(requestSpecification)
            .queryParam("startDate", "2023-03-01")
            .when()
            .get("https://api.nasa.gov/DONKI/RBE")
            .then()
            .assertThat().statusCode(200)
            .extract()
            .jsonPath();

}

@Test

    void getDONKI_Hight_Speed_Stream(){
    Response response = given(requestSpecification)
            .queryParam("startDate", "2023-03-01")
            .when()
            .get("https://api.nasa.gov/DONKI/HSS");

    long timeInMS = response.time();
    long timeInS = response.timeIn(TimeUnit.SECONDS);

    assertEquals(timeInS, timeInMS/1000);
}
@Test

void getDONKIInterplanetaryShock(){
    given(requestSpecification)
            .queryParam("startDate", "2023-01-01")
            .queryParam("endDate", "2023-03-01")
            .queryParam("location", "ALL")
            .queryParam("catalog", "ALL")
            .when()
            .get("https://api.nasa.gov/DONKI/IPS")
            .then()
            .assertThat().body("location[0]", equalTo("Earth"))
            .extract()
            .jsonPath();
}

@Test
    void getDONKI_Interplanetary_Shock_Earth(){
    given(requestSpecification)
            .queryParam("startDate", "2023-01-01")
            .queryParam("endDate", "2023-03-01")
            .queryParam("location", "Earth")
            .queryParam("catalog", "ALL")
            .when()
            .get("https://api.nasa.gov/DONKI/IPS")
            .then().assertThat().body("link[0]", equalTo("https://webtools.ccmc.gsfc.nasa.gov/DONKI/view/IPS/23126/-1"))
            .extract()
            .jsonPath();
}
@Test
    void getDONKI_Solar_Flare(){
    given(requestSpecification)
            .queryParam("startDate", "2023-01-01")
            .queryParam("endDate", "2023-03-01")
            .when()
            .get("https://api.nasa.gov/DONKI/FLR");
}
}
