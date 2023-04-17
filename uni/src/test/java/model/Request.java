
        package model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "senderBankId",
        "recipientBankId",
        "acceptedCurrency",
        "withdrawCurrency",
        "amount",
        "amountType",
        "operationType",
        "feeCurrency",
        "feeDetails",
        "countryCode"
})
@Generated("jsonschema2pojo")
public class Request {

    @JsonProperty("senderBankId")
    private Integer senderBankId;
    @JsonProperty("recipientBankId")
    private Object recipientBankId;
    @JsonProperty("acceptedCurrency")
    private String acceptedCurrency;
    @JsonProperty("withdrawCurrency")
    private String withdrawCurrency;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("amountType")
    private String amountType;
    @JsonProperty("operationType")
    private String operationType;
    @JsonProperty("feeCurrency")
    private String feeCurrency;
    @JsonProperty("feeDetails")
    private Boolean feeDetails;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("senderBankId")
    public Integer getSenderBankId() {
        return senderBankId;
    }

    @JsonProperty("senderBankId")
    public void setSenderBankId(Integer senderBankId) {
        this.senderBankId = senderBankId;
    }

    @JsonProperty("recipientBankId")
    public Object getRecipientBankId() {
        return recipientBankId;
    }

    @JsonProperty("recipientBankId")
    public void setRecipientBankId(Object recipientBankId) {
        this.recipientBankId = recipientBankId;
    }

    @JsonProperty("acceptedCurrency")
    public String getAcceptedCurrency() {
        return acceptedCurrency;
    }

    @JsonProperty("acceptedCurrency")
    public void setAcceptedCurrency(String acceptedCurrency) {
        this.acceptedCurrency = acceptedCurrency;
    }

    @JsonProperty("withdrawCurrency")
    public String getWithdrawCurrency() {
        return withdrawCurrency;
    }

    @JsonProperty("withdrawCurrency")
    public void setWithdrawCurrency(String withdrawCurrency) {
        this.withdrawCurrency = withdrawCurrency;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("amountType")
    public String getAmountType() {
        return amountType;
    }

    @JsonProperty("amountType")
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    @JsonProperty("operationType")
    public String getOperationType() {
        return operationType;
    }

    @JsonProperty("operationType")
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @JsonProperty("feeCurrency")
    public String getFeeCurrency() {
        return feeCurrency;
    }

    @JsonProperty("feeCurrency")
    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    @JsonProperty("feeDetails")
    public Boolean getFeeDetails() {
        return feeDetails;
    }

    @JsonProperty("feeDetails")
    public void setFeeDetails(Boolean feeDetails) {
        this.feeDetails = feeDetails;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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