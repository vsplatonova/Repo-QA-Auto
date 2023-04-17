package specification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import static io.restassured.RestAssured.requestSpecification;


public class Specifications {
    @BeforeEach
    void beforeTest() {

        requestSpecification = new RequestSpecBuilder()
                .log(LogDetail.ALL)
            //    .setContentType(ContentType.ANY)
                .build();
    }
}