package api;

import io.restassured.path.json.JsonPath;
import model.AnalyzeResponse;
import model.RequestEgg;
import model.ResponseList;
import org.junit.jupiter.api.Test;
import specification.Specifications;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class PostRecipeTests extends Specifications {

    @Test
    void postRecipeCuisineMediterranean () {

        JsonPath response = given(requestSpecification)
                .queryParam("title", "Pork roast with green beans")
                .when()
                .post("/recipes/cuisine")
                .body()
                .jsonPath();
        assertThat(response.get("cuisine"), equalTo("Mediterranean"));

    }

    @Test
    void postRecipesIngredientMapEgg() {
        RequestEgg requestEgg = new RequestEgg();

        List<String> ingr = new ArrayList<String>();
        ingr.add("eggs");
        ingr.add("bacon");
        requestEgg.withServings(2);
        requestEgg.withIngredients(ingr);

        ResponseList response = given(requestSpecification)
                .body(requestEgg)
                .post("/food/ingredients/map")
                .then()
                .extract().as(ResponseList.class);

        assertThat(response.get(0).getMeta().get(0), containsString("egg"));
    }
    @Test
    void postRecipeAnalyzeInstructionsGarlic() {

        AnalyzeResponse response = given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .queryParam("apiKey", "f0aff8f0262c4d24a997529555086625")
                .formParam("instructions", "Put the garlic in a pan and then add the onion. Add some salt and oregano")
                .when()
                .post("/recipes/analyzeInstructions")
                .then()
                .extract()
                .body().as(AnalyzeResponse.class);
    }
}
