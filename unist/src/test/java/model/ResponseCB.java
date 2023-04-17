

        package model;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Aed {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Amd {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Aud {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Azn {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Bgn {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Brl {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Byn {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Cad {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Chf {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Cny {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Czk {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Dkk {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Egp {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Eur {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Gbp {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Gel {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Hkd {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Huf {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Idr {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Inr {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Jpy {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Kgs {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Krw {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Kzt {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Mdl {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Nok {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Nzd {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Pln {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Qar {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Date",
        "PreviousDate",
        "PreviousURL",
        "Timestamp",
        "Valute"
})
@Generated("jsonschema2pojo")
  public  class ResponseCB {

    @JsonProperty("Date")
    private String date;
    @JsonProperty("PreviousDate")
    private String previousDate;
    @JsonProperty("PreviousURL")
    private String previousURL;
    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("Valute")
    private Valute valute;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("PreviousDate")
    public String getPreviousDate() {
        return previousDate;
    }

    @JsonProperty("PreviousDate")
    public void setPreviousDate(String previousDate) {
        this.previousDate = previousDate;
    }

    @JsonProperty("PreviousURL")
    public String getPreviousURL() {
        return previousURL;
    }

    @JsonProperty("PreviousURL")
    public void setPreviousURL(String previousURL) {
        this.previousURL = previousURL;
    }

    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("Timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Valute")
    public Valute getValute() {
        return valute;
    }

    @JsonProperty("Valute")
    public void setValute(Valute valute) {
        this.valute = valute;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Ron {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Rsd {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Sek {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Sgd {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Thb {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Tjs {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Tmt {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Try {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Uah {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Usd {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Uzs {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AUD",
        "AZN",
        "GBP",
        "AMD",
        "BYN",
        "BGN",
        "BRL",
        "HUF",
        "VND",
        "HKD",
        "GEL",
        "DKK",
        "AED",
        "USD",
        "EUR",
        "EGP",
        "INR",
        "IDR",
        "KZT",
        "CAD",
        "QAR",
        "KGS",
        "CNY",
        "MDL",
        "NZD",
        "NOK",
        "PLN",
        "RON",
        "XDR",
        "SGD",
        "TJS",
        "THB",
        "TRY",
        "TMT",
        "UZS",
        "UAH",
        "CZK",
        "SEK",
        "CHF",
        "RSD",
        "ZAR",
        "KRW",
        "JPY"
})
@Generated("jsonschema2pojo")
 class Valute {

    @JsonProperty("AUD")
    private Aud aud;
    @JsonProperty("AZN")
    private Azn azn;
    @JsonProperty("GBP")
    private Gbp gbp;
    @JsonProperty("AMD")
    private Amd amd;
    @JsonProperty("BYN")
    private Byn byn;
    @JsonProperty("BGN")
    private Bgn bgn;
    @JsonProperty("BRL")
    private Brl brl;
    @JsonProperty("HUF")
    private Huf huf;
    @JsonProperty("VND")
    private Vnd vnd;
    @JsonProperty("HKD")
    private Hkd hkd;
    @JsonProperty("GEL")
    private Gel gel;
    @JsonProperty("DKK")
    private Dkk dkk;
    @JsonProperty("AED")
    private Aed aed;
    @JsonProperty("USD")
    private Usd usd;
    @JsonProperty("EUR")
    private Eur eur;
    @JsonProperty("EGP")
    private Egp egp;
    @JsonProperty("INR")
    private Inr inr;
    @JsonProperty("IDR")
    private Idr idr;
    @JsonProperty("KZT")
    private Kzt kzt;
    @JsonProperty("CAD")
    private Cad cad;
    @JsonProperty("QAR")
    private Qar qar;
    @JsonProperty("KGS")
    private Kgs kgs;
    @JsonProperty("CNY")
    private Cny cny;
    @JsonProperty("MDL")
    private Mdl mdl;
    @JsonProperty("NZD")
    private Nzd nzd;
    @JsonProperty("NOK")
    private Nok nok;
    @JsonProperty("PLN")
    private Pln pln;
    @JsonProperty("RON")
    private Ron ron;
    @JsonProperty("XDR")
    private Xdr xdr;
    @JsonProperty("SGD")
    private Sgd sgd;
    @JsonProperty("TJS")
    private Tjs tjs;
    @JsonProperty("THB")
    private Thb thb;
    @JsonProperty("TRY")
    private Try _try;
    @JsonProperty("TMT")
    private Tmt tmt;
    @JsonProperty("UZS")
    private Uzs uzs;
    @JsonProperty("UAH")
    private Uah uah;
    @JsonProperty("CZK")
    private Czk czk;
    @JsonProperty("SEK")
    private Sek sek;
    @JsonProperty("CHF")
    private Chf chf;
    @JsonProperty("RSD")
    private Rsd rsd;
    @JsonProperty("ZAR")
    private Zar zar;
    @JsonProperty("KRW")
    private Krw krw;
    @JsonProperty("JPY")
    private Jpy jpy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AUD")
    public Aud getAud() {
        return aud;
    }

    @JsonProperty("AUD")
    public void setAud(Aud aud) {
        this.aud = aud;
    }

    @JsonProperty("AZN")
    public Azn getAzn() {
        return azn;
    }

    @JsonProperty("AZN")
    public void setAzn(Azn azn) {
        this.azn = azn;
    }

    @JsonProperty("GBP")
    public Gbp getGbp() {
        return gbp;
    }

    @JsonProperty("GBP")
    public void setGbp(Gbp gbp) {
        this.gbp = gbp;
    }

    @JsonProperty("AMD")
    public Amd getAmd() {
        return amd;
    }

    @JsonProperty("AMD")
    public void setAmd(Amd amd) {
        this.amd = amd;
    }

    @JsonProperty("BYN")
    public Byn getByn() {
        return byn;
    }

    @JsonProperty("BYN")
    public void setByn(Byn byn) {
        this.byn = byn;
    }

    @JsonProperty("BGN")
    public Bgn getBgn() {
        return bgn;
    }

    @JsonProperty("BGN")
    public void setBgn(Bgn bgn) {
        this.bgn = bgn;
    }

    @JsonProperty("BRL")
    public Brl getBrl() {
        return brl;
    }

    @JsonProperty("BRL")
    public void setBrl(Brl brl) {
        this.brl = brl;
    }

    @JsonProperty("HUF")
    public Huf getHuf() {
        return huf;
    }

    @JsonProperty("HUF")
    public void setHuf(Huf huf) {
        this.huf = huf;
    }

    @JsonProperty("VND")
    public Vnd getVnd() {
        return vnd;
    }

    @JsonProperty("VND")
    public void setVnd(Vnd vnd) {
        this.vnd = vnd;
    }

    @JsonProperty("HKD")
    public Hkd getHkd() {
        return hkd;
    }

    @JsonProperty("HKD")
    public void setHkd(Hkd hkd) {
        this.hkd = hkd;
    }

    @JsonProperty("GEL")
    public Gel getGel() {
        return gel;
    }

    @JsonProperty("GEL")
    public void setGel(Gel gel) {
        this.gel = gel;
    }

    @JsonProperty("DKK")
    public Dkk getDkk() {
        return dkk;
    }

    @JsonProperty("DKK")
    public void setDkk(Dkk dkk) {
        this.dkk = dkk;
    }

    @JsonProperty("AED")
    public Aed getAed() {
        return aed;
    }

    @JsonProperty("AED")
    public void setAed(Aed aed) {
        this.aed = aed;
    }

    @JsonProperty("USD")
    public Usd getUsd() {
        return usd;
    }

    @JsonProperty("USD")
    public void setUsd(Usd usd) {
        this.usd = usd;
    }

    @JsonProperty("EUR")
    public Eur getEur() {
        return eur;
    }

    @JsonProperty("EUR")
    public void setEur(Eur eur) {
        this.eur = eur;
    }

    @JsonProperty("EGP")
    public Egp getEgp() {
        return egp;
    }

    @JsonProperty("EGP")
    public void setEgp(Egp egp) {
        this.egp = egp;
    }

    @JsonProperty("INR")
    public Inr getInr() {
        return inr;
    }

    @JsonProperty("INR")
    public void setInr(Inr inr) {
        this.inr = inr;
    }

    @JsonProperty("IDR")
    public Idr getIdr() {
        return idr;
    }

    @JsonProperty("IDR")
    public void setIdr(Idr idr) {
        this.idr = idr;
    }

    @JsonProperty("KZT")
    public Kzt getKzt() {
        return kzt;
    }

    @JsonProperty("KZT")
    public void setKzt(Kzt kzt) {
        this.kzt = kzt;
    }

    @JsonProperty("CAD")
    public Cad getCad() {
        return cad;
    }

    @JsonProperty("CAD")
    public void setCad(Cad cad) {
        this.cad = cad;
    }

    @JsonProperty("QAR")
    public Qar getQar() {
        return qar;
    }

    @JsonProperty("QAR")
    public void setQar(Qar qar) {
        this.qar = qar;
    }

    @JsonProperty("KGS")
    public Kgs getKgs() {
        return kgs;
    }

    @JsonProperty("KGS")
    public void setKgs(Kgs kgs) {
        this.kgs = kgs;
    }

    @JsonProperty("CNY")
    public Cny getCny() {
        return cny;
    }

    @JsonProperty("CNY")
    public void setCny(Cny cny) {
        this.cny = cny;
    }

    @JsonProperty("MDL")
    public Mdl getMdl() {
        return mdl;
    }

    @JsonProperty("MDL")
    public void setMdl(Mdl mdl) {
        this.mdl = mdl;
    }

    @JsonProperty("NZD")
    public Nzd getNzd() {
        return nzd;
    }

    @JsonProperty("NZD")
    public void setNzd(Nzd nzd) {
        this.nzd = nzd;
    }

    @JsonProperty("NOK")
    public Nok getNok() {
        return nok;
    }

    @JsonProperty("NOK")
    public void setNok(Nok nok) {
        this.nok = nok;
    }

    @JsonProperty("PLN")
    public Pln getPln() {
        return pln;
    }

    @JsonProperty("PLN")
    public void setPln(Pln pln) {
        this.pln = pln;
    }

    @JsonProperty("RON")
    public Ron getRon() {
        return ron;
    }

    @JsonProperty("RON")
    public void setRon(Ron ron) {
        this.ron = ron;
    }

    @JsonProperty("XDR")
    public Xdr getXdr() {
        return xdr;
    }

    @JsonProperty("XDR")
    public void setXdr(Xdr xdr) {
        this.xdr = xdr;
    }

    @JsonProperty("SGD")
    public Sgd getSgd() {
        return sgd;
    }

    @JsonProperty("SGD")
    public void setSgd(Sgd sgd) {
        this.sgd = sgd;
    }

    @JsonProperty("TJS")
    public Tjs getTjs() {
        return tjs;
    }

    @JsonProperty("TJS")
    public void setTjs(Tjs tjs) {
        this.tjs = tjs;
    }

    @JsonProperty("THB")
    public Thb getThb() {
        return thb;
    }

    @JsonProperty("THB")
    public void setThb(Thb thb) {
        this.thb = thb;
    }

    @JsonProperty("TRY")
    public Try getTry() {
        return _try;
    }

    @JsonProperty("TRY")
    public void setTry(Try _try) {
        this._try = _try;
    }

    @JsonProperty("TMT")
    public Tmt getTmt() {
        return tmt;
    }

    @JsonProperty("TMT")
    public void setTmt(Tmt tmt) {
        this.tmt = tmt;
    }

    @JsonProperty("UZS")
    public Uzs getUzs() {
        return uzs;
    }

    @JsonProperty("UZS")
    public void setUzs(Uzs uzs) {
        this.uzs = uzs;
    }

    @JsonProperty("UAH")
    public Uah getUah() {
        return uah;
    }

    @JsonProperty("UAH")
    public void setUah(Uah uah) {
        this.uah = uah;
    }

    @JsonProperty("CZK")
    public Czk getCzk() {
        return czk;
    }

    @JsonProperty("CZK")
    public void setCzk(Czk czk) {
        this.czk = czk;
    }

    @JsonProperty("SEK")
    public Sek getSek() {
        return sek;
    }

    @JsonProperty("SEK")
    public void setSek(Sek sek) {
        this.sek = sek;
    }

    @JsonProperty("CHF")
    public Chf getChf() {
        return chf;
    }

    @JsonProperty("CHF")
    public void setChf(Chf chf) {
        this.chf = chf;
    }

    @JsonProperty("RSD")
    public Rsd getRsd() {
        return rsd;
    }

    @JsonProperty("RSD")
    public void setRsd(Rsd rsd) {
        this.rsd = rsd;
    }

    @JsonProperty("ZAR")
    public Zar getZar() {
        return zar;
    }

    @JsonProperty("ZAR")
    public void setZar(Zar zar) {
        this.zar = zar;
    }

    @JsonProperty("KRW")
    public Krw getKrw() {
        return krw;
    }

    @JsonProperty("KRW")
    public void setKrw(Krw krw) {
        this.krw = krw;
    }

    @JsonProperty("JPY")
    public Jpy getJpy() {
        return jpy;
    }

    @JsonProperty("JPY")
    public void setJpy(Jpy jpy) {
        this.jpy = jpy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
class Vnd {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Xdr {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "NumCode",
        "CharCode",
        "Nominal",
        "Name",
        "Value",
        "Previous"
})
@Generated("jsonschema2pojo")
 class Zar {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}