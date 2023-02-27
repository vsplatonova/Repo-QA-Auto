 package model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

 @JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ingredients",
        "servings"
})
@Generated("jsonschema2pojo")
public class RequestEgg {

    @JsonProperty("ingredients")
    private List<String> ingredients = new ArrayList<String>();
    @JsonProperty("servings")
    private Integer servings;

    @JsonProperty("ingredients")
    public List<String> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public RequestEgg withIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @JsonProperty("servings")
    public Integer getServings() {
        return servings;
    }

    @JsonProperty("servings")
    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public RequestEgg withServings(Integer servings) {
        this.servings = servings;
        return this;

    }

}