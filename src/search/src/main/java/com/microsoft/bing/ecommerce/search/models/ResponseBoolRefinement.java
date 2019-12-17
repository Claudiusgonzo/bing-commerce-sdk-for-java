/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.ecommerce.search.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ResponseBoolRefinement model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ResponseBoolRefinement.class)
@JsonTypeName("BoolRefinement")
public class ResponseBoolRefinement extends ResponseRefinementBase {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ResponseBoolRefinement object itself.
     */
    public ResponseBoolRefinement withValue(Boolean value) {
        this.value = value;
        return this;
    }

}

