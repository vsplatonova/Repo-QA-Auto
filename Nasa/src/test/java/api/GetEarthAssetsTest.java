package api;

import io.restassured.path.json.JsonPath;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import specification.Specifications;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetEarthAssetsTest extends Specifications {

    @Test

    void earthAssetsWithQuery (){

        JsonPath response= given(requestSpecification)
                .queryParam("lon", "-95.3")
                .queryParam("lat", "29.78")
                .queryParam("date", "2018-02-01")
                .queryParam("dim", "0.10")
                .when()
                .get("https://api.nasa.gov/planetary/earth/assets")
                .body()
                .jsonPath();
        response.prettyPrint();
        assertThat(response.get("resource.planet"), equalTo("earth"));

    }
}
