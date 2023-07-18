package api;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import specification.Specifications;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class GetApodDateTest extends Specifications {

    @Test

    void  getApodWithQueryData() {
        JsonPath response= given(requestSpecification)
        .queryParam("date", "2023-04-20")
        .when()
        .get("https://api.nasa.gov/planetary/apod")
        .body()
        .jsonPath();
        assertThat(response.get("title"), equalTo("The Dark Seahorse in Cepheus"));
    }


}
