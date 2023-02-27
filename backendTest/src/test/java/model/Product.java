package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "upc",
        "title"
})

@Generated("jsonschema2pojo")
 public class Product {


    @JsonProperty("id")
    private Integer id;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("title")
    private String title;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Product withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Product withUpc(String upc) {
        this.upc = upc;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Product withTitle(String title) {
        this.title = title;
        return this;
    }

}
