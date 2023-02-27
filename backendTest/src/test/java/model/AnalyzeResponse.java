package model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "parsedInstructions",
        "ingredients",
        "equipment"
})
@Generated("jsonschema2pojo")
public class AnalyzeResponse {

    @JsonProperty("parsedInstructions")
    private List<ParsedInstruction> parsedInstructions = new ArrayList<ParsedInstruction>();
    @JsonProperty("ingredients")
    private List<Ingredient__1> ingredients = new ArrayList<Ingredient__1>();
    @JsonProperty("equipment")
    private List<Equipment__1> equipment = new ArrayList<Equipment__1>();

    @JsonProperty("parsedInstructions")
    public List<ParsedInstruction> getParsedInstructions() {
        return parsedInstructions;
    }

    @JsonProperty("parsedInstructions")
    public void setParsedInstructions(List<ParsedInstruction> parsedInstructions) {
        this.parsedInstructions = parsedInstructions;
    }

    public AnalyzeResponse withParsedInstructions(List<ParsedInstruction> parsedInstructions) {
        this.parsedInstructions = parsedInstructions;
        return this;
    }

    @JsonProperty("ingredients")
    public List<Ingredient__1> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<Ingredient__1> ingredients) {
        this.ingredients = ingredients;
    }

    public AnalyzeResponse withIngredients(List<Ingredient__1> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @JsonProperty("equipment")
    public List<Equipment__1> getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(List<Equipment__1> equipment) {
        this.equipment = equipment;
    }

    public AnalyzeResponse withEquipment(List<Equipment__1> equipment) {
        this.equipment = equipment;
        return this;
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "localizedName",
        "image"
})
@Generated("jsonschema2pojo")
class Equipment {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("localizedName")
    private String localizedName;
    @JsonProperty("image")
    private String image;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Equipment withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Equipment withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("localizedName")
    public String getLocalizedName() {
        return localizedName;
    }

    @JsonProperty("localizedName")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public Equipment withLocalizedName(String localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Equipment withImage(String image) {
        this.image = image;
        return this;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})
@Generated("jsonschema2pojo")
 class Equipment__1 {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Equipment__1 withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Equipment__1 withName(String name) {
        this.name = name;
        return this;
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "localizedName",
        "image"
})
@Generated("jsonschema2pojo")
 class Ingredient {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("localizedName")
    private String localizedName;
    @JsonProperty("image")
    private String image;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Ingredient withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Ingredient withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("localizedName")
    public String getLocalizedName() {
        return localizedName;
    }

    @JsonProperty("localizedName")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public Ingredient withLocalizedName(String localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Ingredient withImage(String image) {
        this.image = image;
        return this;
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})
@Generated("jsonschema2pojo")
class Ingredient__1 {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Ingredient__1 withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Ingredient__1 withName(String name) {
        this.name = name;
        return this;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "steps"
})
@Generated("jsonschema2pojo")
 class ParsedInstruction {

    @JsonProperty("name")
    private String name;
    @JsonProperty("steps")
    private List<Step> steps = new ArrayList<Step>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ParsedInstruction withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("steps")
    public List<Step> getSteps() {
        return steps;
    }

    @JsonProperty("steps")
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public ParsedInstruction withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "number",
        "step",
        "ingredients",
        "equipment"
})
@Generated("jsonschema2pojo")
 class Step {

    @JsonProperty("number")
    private Integer number;
    @JsonProperty("step")
    private String step;
    @JsonProperty("ingredients")
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();
    @JsonProperty("equipment")
    private List<Equipment> equipment = new ArrayList<Equipment>();

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Step withNumber(Integer number) {
        this.number = number;
        return this;
    }

    @JsonProperty("step")
    public String getStep() {
        return step;
    }

    @JsonProperty("step")
    public void setStep(String step) {
        this.step = step;
    }

    public Step withStep(String step) {
        this.step = step;
        return this;
    }

    @JsonProperty("ingredients")
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Step withIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @JsonProperty("equipment")
    public List<Equipment> getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public Step withEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
        return this;
    }

}