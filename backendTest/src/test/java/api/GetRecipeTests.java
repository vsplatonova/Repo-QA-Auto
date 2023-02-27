package api;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import specification.Specifications;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class GetRecipeTests extends Specifications {
@Test
    void getRecipeWithQueryPasta() {
        given()
                .spec(requestSpecification)
                .queryParam("maxAlcohol", "100")
                .when()
                .get("/recipes/complexSearch")
                .then()
                .spec(responseSpecification.expect().body(containsString("Cannellini Bean and Asparagus Salad with Mushroom")));
    }

    @Test
    void getRecipeWithQueryCuisine() {
        JsonPath response = given(requestSpecification)
                .queryParam("cuisine", "Italian", "excludeCuisine", "greek", "maxCalories", "800")
                .when()
                .get("/recipes/complexSearch")
                .body()
                .jsonPath();
        response.prettyPrint();
        assertThat(response.get("results[0].title"), equalTo("Turkey Tomato Cheese Pizza"));

    }

    @Test
    void getRecipeWithAnalyze() {
        JsonPath response = given(requestSpecification)
                .queryParam("q", "salmon with fusilli and no nuts")
                .when()
                .get("/recipes/queries/analyze")
                .body()
                .jsonPath();
        assertThat(response.get("ingredients[0].name"), equalTo("fusilli"));


    }

    @Test
    void getRecipeWithEquipment() {

        JsonPath response = given(requestSpecification)
                .queryParam("cuisine", "russian")
                .queryParam("maxAlcohol", "1004")
                .queryParam("equipment", "pan")
                .when()
                .get("/recipes/complexSearch")
                .body()
                .jsonPath();
        assertThat(response.get("results[1].title"), equalTo("Cauliflower, Brown Rice, and Vegetable Fried Rice"));

    }

    @Test
    void getRecipeWithMaxCalories() {

        JsonPath response = given(requestSpecification)
                .queryParam("cuisine", "italian")
                .queryParam("excludeCuisine", "greek")
                .queryParam("maxCalories", "800")
                .when()
                .get("/recipes/complexSearch")
                .body()
                .jsonPath();
        assertThat(response.get("results[1].title"), equalTo("Broccolini Quinoa Pilaf"));


    }

}