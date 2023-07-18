package api;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import specification.Specifications;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EPICRetrievableMetadataTest extends Specifications {

@Test
    void getEpicRetrievableMetaData(){
        JsonPath response= given(requestSpecification)
                .when()
                .get("https://api.nasa.gov/EPIC/api/natural/images")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .jsonPath();
response.prettyPrint();
    assertThat(response.get("identifier[0]"), equalTo("20230616002713"));

    }
}
