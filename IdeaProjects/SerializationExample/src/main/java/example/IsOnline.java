
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
    "Active",
    "Exclusive",
    "Sellable",
    "Orderable",
    "StoreClearance"
})
public class IsOnline {

    @JsonProperty("Active")
    private String active;
    @JsonProperty("Exclusive")
    private String exclusive;
    @JsonProperty("Sellable")
    private String sellable;
    @JsonProperty("Orderable")
    private String orderable;
    @JsonProperty("StoreClearance")
    private String storeClearance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The active
     */
    @JsonProperty("Active")
    public String getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The Active
     */
    @JsonProperty("Active")
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The exclusive
     */
    @JsonProperty("Exclusive")
    public String getExclusive() {
        return exclusive;
    }

    /**
     * 
     * @param exclusive
     *     The Exclusive
     */
    @JsonProperty("Exclusive")
    public void setExclusive(String exclusive) {
        this.exclusive = exclusive;
    }

    /**
     * 
     * @return
     *     The sellable
     */
    @JsonProperty("Sellable")
    public String getSellable() {
        return sellable;
    }

    /**
     * 
     * @param sellable
     *     The Sellable
     */
    @JsonProperty("Sellable")
    public void setSellable(String sellable) {
        this.sellable = sellable;
    }

    /**
     * 
     * @return
     *     The orderable
     */
    @JsonProperty("Orderable")
    public String getOrderable() {
        return orderable;
    }

    /**
     * 
     * @param orderable
     *     The Orderable
     */
    @JsonProperty("Orderable")
    public void setOrderable(String orderable) {
        this.orderable = orderable;
    }

    /**
     * 
     * @return
     *     The storeClearance
     */
    @JsonProperty("StoreClearance")
    public String getStoreClearance() {
        return storeClearance;
    }

    /**
     * 
     * @param storeClearance
     *     The StoreClearance
     */
    @JsonProperty("StoreClearance")
    public void setStoreClearance(String storeClearance) {
        this.storeClearance = storeClearance;
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
