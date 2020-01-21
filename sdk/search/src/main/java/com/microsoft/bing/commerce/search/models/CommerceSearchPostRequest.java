// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CommerceSearchPostRequest model.
 */
public class CommerceSearchPostRequest {
    /**
     * The market where the results come from. Thypically, `mkt` is the country
     * where the user is making the request from.
     */
    @JsonProperty(value = "market")
    private String market;

    /**
     * The client property.
     */
    @JsonProperty(value = "client")
    private RequestClient client;

    /**
     * The language to use for user interface strings. You may specify the
     * language using either a 2-letter or 4-letter code. Using 4-letter codes
     * is preferred.
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * The query that determines the result set match criteria.
     */
    @JsonProperty(value = "query")
    private RequestQuery query;

    /**
     * A description for how the items in the result set would look like.
     */
    @JsonProperty(value = "items")
    private RequestItems items;

    /**
     * The aggregations property.
     */
    @JsonProperty(value = "aggregations")
    private List<RequestAggregationBase> aggregations;

    /**
     * The debug property.
     */
    @JsonProperty(value = "debug")
    private Boolean debug;

    /**
     * A saved search instance configuration to apply to current request.
     */
    @JsonProperty(value = "searchInstanceId")
    private String searchInstanceId;

    /**
     * Get the market where the results come from. Thypically, `mkt` is the country where the user is making the request from.
     *
     * @return the market value
     */
    public String market() {
        return this.market;
    }

    /**
     * Set the market where the results come from. Thypically, `mkt` is the country where the user is making the request from.
     *
     * @param market the market value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * Get the client value.
     *
     * @return the client value
     */
    public RequestClient client() {
        return this.client;
    }

    /**
     * Set the client value.
     *
     * @param client the client value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withClient(RequestClient client) {
        this.client = client;
        return this;
    }

    /**
     * Get the language to use for user interface strings. You may specify the language using either a 2-letter or 4-letter code. Using 4-letter codes is preferred.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language to use for user interface strings. You may specify the language using either a 2-letter or 4-letter code. Using 4-letter codes is preferred.
     *
     * @param language the language value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the query that determines the result set match criteria.
     *
     * @return the query value
     */
    public RequestQuery query() {
        return this.query;
    }

    /**
     * Set the query that determines the result set match criteria.
     *
     * @param query the query value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withQuery(RequestQuery query) {
        this.query = query;
        return this;
    }

    /**
     * Get a description for how the items in the result set would look like.
     *
     * @return the items value
     */
    public RequestItems items() {
        return this.items;
    }

    /**
     * Set a description for how the items in the result set would look like.
     *
     * @param items the items value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withItems(RequestItems items) {
        this.items = items;
        return this;
    }

    /**
     * Get the aggregations value.
     *
     * @return the aggregations value
     */
    public List<RequestAggregationBase> aggregations() {
        return this.aggregations;
    }

    /**
     * Set the aggregations value.
     *
     * @param aggregations the aggregations value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withAggregations(List<RequestAggregationBase> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    /**
     * Get the debug value.
     *
     * @return the debug value
     */
    public Boolean debug() {
        return this.debug;
    }

    /**
     * Set the debug value.
     *
     * @param debug the debug value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }

    /**
     * Get a saved search instance configuration to apply to current request.
     *
     * @return the searchInstanceId value
     */
    public String searchInstanceId() {
        return this.searchInstanceId;
    }

    /**
     * Set a saved search instance configuration to apply to current request.
     *
     * @param searchInstanceId the searchInstanceId value to set
     * @return the CommerceSearchPostRequest object itself.
     */
    public CommerceSearchPostRequest withSearchInstanceId(String searchInstanceId) {
        this.searchInstanceId = searchInstanceId;
        return this;
    }

}