/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.ecommerce.search.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResponseItem model.
 */
public class ResponseItem {
    /**
     * The indexId property.
     */
    @JsonProperty(value = "indexId")
    private String indexId;

    /**
     * The itemId property.
     */
    @JsonProperty(value = "itemId")
    private String itemId;

    /**
     * The score property.
     */
    @JsonProperty(value = "score")
    private Double score;

    /**
     * The fields property.
     */
    @JsonProperty(value = "fields")
    private Object fields;

    /**
     * The debug property.
     */
    @JsonProperty(value = "debug")
    private List<ResponseDebugInfo> debug;

    /**
     * Get the indexId value.
     *
     * @return the indexId value
     */
    public String indexId() {
        return this.indexId;
    }

    /**
     * Set the indexId value.
     *
     * @param indexId the indexId value to set
     * @return the ResponseItem object itself.
     */
    public ResponseItem withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * Get the itemId value.
     *
     * @return the itemId value
     */
    public String itemId() {
        return this.itemId;
    }

    /**
     * Set the itemId value.
     *
     * @param itemId the itemId value to set
     * @return the ResponseItem object itself.
     */
    public ResponseItem withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Double score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the ResponseItem object itself.
     */
    public ResponseItem withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the fields value.
     *
     * @return the fields value
     */
    public Object fields() {
        return this.fields;
    }

    /**
     * Set the fields value.
     *
     * @param fields the fields value to set
     * @return the ResponseItem object itself.
     */
    public ResponseItem withFields(Object fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the debug value.
     *
     * @return the debug value
     */
    public List<ResponseDebugInfo> debug() {
        return this.debug;
    }

    /**
     * Set the debug value.
     *
     * @param debug the debug value to set
     * @return the ResponseItem object itself.
     */
    public ResponseItem withDebug(List<ResponseDebugInfo> debug) {
        this.debug = debug;
        return this;
    }

}