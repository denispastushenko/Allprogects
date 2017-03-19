
package example;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Banner",
    "Store",
    "SKU",
    "CheckDigit",
    "Product",
    "Price",
    "Quantity",
    "Location",
    "Description",
    "Messages",
    "PartNumber",
    "IsOnline",
    "Corporate",
    "IsOnlineActive",
    "IsOnlineExclusive",
    "IsOnlineSellable",
    "IsOnlineOrderable"
})
public class Example {

    @JsonProperty("Banner")
    private String banner;
    @JsonProperty("Store")
    private String store;
    @JsonProperty("SKU")
    private String sKU;
    @JsonProperty("CheckDigit")
    private String checkDigit;
    @JsonProperty("Product")
    private String product;
    @JsonProperty("Price")
    private Double price;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("Location")
    private Location location;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Messages")
    private Messages messages;
    @JsonProperty("PartNumber")
    private String partNumber;
    @JsonProperty("IsOnline")
    private IsOnline isOnline;
    @JsonProperty("Corporate")
    private Corporate corporate;
    @JsonProperty("IsOnlineActive")
    private String isOnlineActive;
    @JsonProperty("IsOnlineExclusive")
    private String isOnlineExclusive;
    @JsonProperty("IsOnlineSellable")
    private String isOnlineSellable;
    @JsonProperty("IsOnlineOrderable")
    private String isOnlineOrderable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The banner
     */
    @JsonProperty("Banner")
    public String getBanner() {
        return banner;
    }

    /**
     * 
     * @param banner
     *     The Banner
     */
    @JsonProperty("Banner")
    public void setBanner(String banner) {
        this.banner = banner;
    }

    /**
     * 
     * @return
     *     The store
     */
    @JsonProperty("Store")
    public String getStore() {
        return store;
    }

    /**
     * 
     * @param store
     *     The Store
     */
    @JsonProperty("Store")
    public void setStore(String store) {
        this.store = store;
    }

    /**
     * 
     * @return
     *     The sKU
     */
    @JsonProperty("SKU")
    public String getSKU() {
        return sKU;
    }

    /**
     * 
     * @param sKU
     *     The SKU
     */
    @JsonProperty("SKU")
    public void setSKU(String sKU) {
        this.sKU = sKU;
    }

    /**
     * 
     * @return
     *     The checkDigit
     */
    @JsonProperty("CheckDigit")
    public String getCheckDigit() {
        return checkDigit;
    }

    /**
     * 
     * @param checkDigit
     *     The CheckDigit
     */
    @JsonProperty("CheckDigit")
    public void setCheckDigit(String checkDigit) {
        this.checkDigit = checkDigit;
    }

    /**
     * 
     * @return
     *     The product
     */
    @JsonProperty("Product")
    public String getProduct() {
        return product;
    }

    /**
     * 
     * @param product
     *     The Product
     */
    @JsonProperty("Product")
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("Price")
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The Price
     */
    @JsonProperty("Price")
    public void setPrice(Double price) {
        this.price = price;
    }

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
     *     The location
     */
    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The Location
     */
    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("Messages")
    public Messages getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The Messages
     */
    @JsonProperty("Messages")
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    /**
     * 
     * @return
     *     The partNumber
     */
    @JsonProperty("PartNumber")
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * 
     * @param partNumber
     *     The PartNumber
     */
    @JsonProperty("PartNumber")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * 
     * @return
     *     The isOnline
     */
    @JsonProperty("IsOnline")
    public IsOnline getIsOnline() {
        return isOnline;
    }

    /**
     * 
     * @param isOnline
     *     The IsOnline
     */
    @JsonProperty("IsOnline")
    public void setIsOnline(IsOnline isOnline) {
        this.isOnline = isOnline;
    }

    /**
     * 
     * @return
     *     The corporate
     */
    @JsonProperty("Corporate")
    public Corporate getCorporate() {
        return corporate;
    }

    /**
     * 
     * @param corporate
     *     The Corporate
     */
    @JsonProperty("Corporate")
    public void setCorporate(Corporate corporate) {
        this.corporate = corporate;
    }

    /**
     * 
     * @return
     *     The isOnlineActive
     */
    @JsonProperty("IsOnlineActive")
    public String getIsOnlineActive() {
        return isOnlineActive;
    }

    /**
     * 
     * @param isOnlineActive
     *     The IsOnlineActive
     */
    @JsonProperty("IsOnlineActive")
    public void setIsOnlineActive(String isOnlineActive) {
        this.isOnlineActive = isOnlineActive;
    }

    /**
     * 
     * @return
     *     The isOnlineExclusive
     */
    @JsonProperty("IsOnlineExclusive")
    public String getIsOnlineExclusive() {
        return isOnlineExclusive;
    }

    /**
     * 
     * @param isOnlineExclusive
     *     The IsOnlineExclusive
     */
    @JsonProperty("IsOnlineExclusive")
    public void setIsOnlineExclusive(String isOnlineExclusive) {
        this.isOnlineExclusive = isOnlineExclusive;
    }

    /**
     * 
     * @return
     *     The isOnlineSellable
     */
    @JsonProperty("IsOnlineSellable")
    public String getIsOnlineSellable() {
        return isOnlineSellable;
    }

    /**
     * 
     * @param isOnlineSellable
     *     The IsOnlineSellable
     */
    @JsonProperty("IsOnlineSellable")
    public void setIsOnlineSellable(String isOnlineSellable) {
        this.isOnlineSellable = isOnlineSellable;
    }

    /**
     * 
     * @return
     *     The isOnlineOrderable
     */
    @JsonProperty("IsOnlineOrderable")
    public String getIsOnlineOrderable() {
        return isOnlineOrderable;
    }

    /**
     * 
     * @param isOnlineOrderable
     *     The IsOnlineOrderable
     */
    @JsonProperty("IsOnlineOrderable")
    public void setIsOnlineOrderable(String isOnlineOrderable) {
        this.isOnlineOrderable = isOnlineOrderable;
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
