package model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "original",
        "originalName",
        "ingredientImage",
        "meta",
        "products"
})

@Generated("jsonschema2pojo")
public class ResponseEgg {

    @JsonProperty("original")
    private String original;
    @JsonProperty("originalName")
    private String originalName;
    @JsonProperty("ingredientImage")
    private String ingredientImage;
    @JsonProperty("meta")
    private List<String> meta = new ArrayList<String>();
    @JsonProperty("products")
    private List<Product> products = new ArrayList<Product>();

    @JsonProperty("original")
    public String getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(String original) {
        this.original = original;
    }

    public ResponseEgg withOriginal(String original) {
        this.original = original;
        return this;
    }

    @JsonProperty("originalName")
    public String getOriginalName() {
        return originalName;
    }

    @JsonProperty("originalName")
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public ResponseEgg withOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }

    @JsonProperty("ingredientImage")
    public String getIngredientImage() {
        return ingredientImage;
    }

    @JsonProperty("ingredientImage")
    public void setIngredientImage(String ingredientImage) {
        this.ingredientImage = ingredientImage;
    }

    public ResponseEgg withIngredientImage(String ingredientImage) {
        this.ingredientImage = ingredientImage;
        return this;
    }

    @JsonProperty("meta")
    public List<String> getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(List<String> meta) {
        this.meta = meta;
    }

    public ResponseEgg withMeta(List<String> meta) {
        this.meta = meta;
        return this;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ResponseEgg withProducts(List<Product> products) {
        this.products = products;
        return this;
    }

}