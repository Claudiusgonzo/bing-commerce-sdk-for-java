/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.ecommerce.search.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The ResponseFieldAggregationBase model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ResponseFieldAggregationBase.class)
@JsonTypeName("Response.FieldAggregationBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Response.FacetBase", value = ResponseFacetBase.class),
    @JsonSubTypes.Type(name = "Min", value = ResponseMin.class),
    @JsonSubTypes.Type(name = "Max", value = ResponseMax.class)
})
public class ResponseFieldAggregationBase extends ResponseAggregation {
    /**
     * The field property.
     */
    @JsonProperty(value = "field")
    private String field;

    /**
     * Get the field value.
     *
     * @return the field value
     */
    public String field() {
        return this.field;
    }

    /**
     * Set the field value.
     *
     * @param field the field value to set
     * @return the ResponseFieldAggregationBase object itself.
     */
    public ResponseFieldAggregationBase withField(String field) {
        this.field = field;
        return this;
    }

}

