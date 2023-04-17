package api;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import model.Request;
import model.ResponseUni;
import org.junit.jupiter.api.Assertions;
import specification.Specifications;
import org.junit.jupiter.api.Test;
import java.util.List;
import static io.restassured.RestAssured.*;



public class UnistreamTest extends Specifications {

    @Test
    void postTransferToARM () {
        Request requestBody = new Request();
        requestBody.setSenderBankId(10400);
        requestBody.setRecipientBankId(null);
        requestBody.setAcceptedCurrency("RUB");
        requestBody.setWithdrawCurrency("AMD");
        requestBody.setAmount(1000.00);
        requestBody.setAmountType("AcceptedAmount");
        requestBody.setOperationType("Transfer");
        requestBody.setFeeCurrency("RUB");
        requestBody.setFeeDetails(true);
        requestBody.setCountryCode("ARM");


        Response response = given()
                .body(requestBody)
                .when()
                .post("https://slt-test.info.api.unistream.com/api/v1/transfer/calculate")
                .then()
                .statusCode(200)
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());

    }

    @Test
    void getCompareUniAndCB (){


       List<ResponseUni> responseUni = given()
                .when()
                .get("https://slt-test.info.api.unistream.com/api/v1/poses/officialrates")
                .then()
                .statusCode(200)
                .extract().body().jsonPath().getList(".", ResponseUni.class);



     JsonPath responseCb =  given()
                .when()
                .get("https://www.cbr-xml-daily.ru/daily_json.js")
                .body()
                .jsonPath();


        /*List<ResponseCB> read = responseCb.getObject("", ResponseCB.class);
        System.out.println("keys: "+read);
*/

    }
}