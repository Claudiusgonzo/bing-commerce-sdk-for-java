/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.ecommerce.search.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RequestItems model.
 */
public class RequestItems {
    /**
     * The select property.
     */
    @JsonProperty(value = "select")
    private List<String> select;

    /**
     * The orderBy property.
     */
    @JsonProperty(value = "orderBy")
    private String orderBy;

    /**
     * The top property.
     */
    @JsonProperty(value = "top")
    private Integer top;

    /**
     * The skip property.
     */
    @JsonProperty(value = "skip")
    private Integer skip;

    /**
     * The dedupe property.
     */
    @JsonProperty(value = "dedupe")
    private Boolean dedupe;

    /**
     * Get the select value.
     *
     * @return the select value
     */
    public List<String> select() {
        return this.select;
    }

    /**
     * Set the select value.
     *
     * @param select the select value to set
     * @return the RequestItems object itself.
     */
    public RequestItems withSelect(List<String> select) {
        this.select = select;
        return this;
    }

    /**
     * Get the orderBy value.
     *
     * @return the orderBy value
     */
    public String orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy value.
     *
     * @param orderBy the orderBy value to set
     * @return the RequestItems object itself.
     */
    public RequestItems withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the top value.
     *
     * @return the top value
     */
    public Integer top() {
        return this.top;
    }

    /**
     * Set the top value.
     *
     * @param top the top value to set
     * @return the RequestItems object itself.
     */
    public RequestItems withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get the skip value.
     *
     * @return the skip value
     */
    public Integer skip() {
        return this.skip;
    }

    /**
     * Set the skip value.
     *
     * @param skip the skip value to set
     * @return the RequestItems object itself.
     */
    public RequestItems withSkip(Integer skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Get the dedupe value.
     *
     * @return the dedupe value
     */
    public Boolean dedupe() {
        return this.dedupe;
    }

    /**
     * Set the dedupe value.
     *
     * @param dedupe the dedupe value to set
     * @return the RequestItems object itself.
     */
    public RequestItems withDedupe(Boolean dedupe) {
        this.dedupe = dedupe;
        return this;
    }

}