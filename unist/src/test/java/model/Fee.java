package model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "acceptedAmount",
        "acceptedCurrency",
        "withdrawAmount",
        "withdrawCurrency",
        "rate",
        "acceptedTotalFee",
        "acceptedTotalFeeCurrency"
})
@Generated("jsonschema2pojo")
public class Fee {

    @JsonProperty("name")
    private String name;
    @JsonProperty("acceptedAmount")
    private Double acceptedAmount;
    @JsonProperty("acceptedCurrency")
    private String acceptedCurrency;
    @JsonProperty("withdrawAmount")
    private Double withdrawAmount;
    @JsonProperty("withdrawCurrency")
    private String withdrawCurrency;
    @JsonProperty("rate")
    private Double rate;
    @JsonProperty("acceptedTotalFee")
    private Double acceptedTotalFee;
    @JsonProperty("acceptedTotalFeeCurrency")
    private String acceptedTotalFeeCurrency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("acceptedAmount")
    public Double getAcceptedAmount() {
        return acceptedAmount;
    }

    @JsonProperty("acceptedAmount")
    public void setAcceptedAmount(Double acceptedAmount) {
        this.acceptedAmount = acceptedAmount;
    }

    @JsonProperty("acceptedCurrency")
    public String getAcceptedCurrency() {
        return acceptedCurrency;
    }

    @JsonProperty("acceptedCurrency")
    public void setAcceptedCurrency(String acceptedCurrency) {
        this.acceptedCurrency = acceptedCurrency;
    }

    @JsonProperty("withdrawAmount")
    public Double getWithdrawAmount() {
        return withdrawAmount;
    }

    @JsonProperty("withdrawAmount")
    public void setWithdrawAmount(Double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    @JsonProperty("withdrawCurrency")
    public String getWithdrawCurrency() {
        return withdrawCurrency;
    }

    @JsonProperty("withdrawCurrency")
    public void setWithdrawCurrency(String withdrawCurrency) {
        this.withdrawCurrency = withdrawCurrency;
    }

    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    @JsonProperty("acceptedTotalFee")
    public Double getAcceptedTotalFee() {
        return acceptedTotalFee;
    }

    @JsonProperty("acceptedTotalFee")
    public void setAcceptedTotalFee(Double acceptedTotalFee) {
        this.acceptedTotalFee = acceptedTotalFee;
    }

    @JsonProperty("acceptedTotalFeeCurrency")
    public String getAcceptedTotalFeeCurrency() {
        return acceptedTotalFeeCurrency;
    }

    @JsonProperty("acceptedTotalFeeCurrency")
    public void setAcceptedTotalFeeCurrency(String acceptedTotalFeeCurrency) {
        this.acceptedTotalFeeCurrency = acceptedTotalFeeCurrency;
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
