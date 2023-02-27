package specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;

import static io.restassured.RestAssured.requestSpecification;
import static io.restassured.RestAssured.responseSpecification;

public class Specifications {
    @BeforeEach
    void beforeTest() {
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();

        requestSpecification = new RequestSpecBuilder()
                .addQueryParam("apiKey", new Object[]{"f0aff8f0262c4d24a997529555086625"})
                .setBaseUri("https://api.spoonacular.com/")
                .log(LogDetail.ALL)
                .setContentType(ContentType.JSON)
                .build();
    }
}
