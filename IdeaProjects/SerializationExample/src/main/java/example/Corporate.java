
package example;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Quantity",
    "MinOrderQty",
    "MinETA",
    "MaxETA"
})
public class Corporate {

    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("MinOrderQty")
    private Integer minOrderQty;
    @JsonProperty("MinETA")
    private Integer minETA;
    @JsonProperty("MaxETA")
    private Integer maxETA;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The Quantity
     */
    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The minOrderQty
     */
    @JsonProperty("MinOrderQty")
    public Integer getMinOrderQty() {
        return minOrderQty;
    }

    /**
     * 
     * @param minOrderQty
     *     The MinOrderQty
     */
    @JsonProperty("MinOrderQty")
    public void setMinOrderQty(Integer minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

    /**
     * 
     * @return
     *     The minETA
     */
    @JsonProperty("MinETA")
    public Integer getMinETA() {
        return minETA;
    }

    /**
     * 
     * @param minETA
     *     The MinETA
     */
    @JsonProperty("MinETA")
    public void setMinETA(Integer minETA) {
        this.minETA = minETA;
    }

    /**
     * 
     * @return
     *     The maxETA
     */
    @JsonProperty("MaxETA")
    public Integer getMaxETA() {
        return maxETA;
    }

    /**
     * 
     * @param maxETA
     *     The MaxETA
     */
    @JsonProperty("MaxETA")
    public void setMaxETA(Integer maxETA) {
        this.maxETA = maxETA;
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
