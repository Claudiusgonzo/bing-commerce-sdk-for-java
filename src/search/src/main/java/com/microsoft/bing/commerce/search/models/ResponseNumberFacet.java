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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a facet on a numeric field.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ResponseNumberFacet.class)
@JsonTypeName("NumberFacet")
public class ResponseNumberFacet extends ResponseFacetBase {
    /**
     * The refinements property.
     */
    @JsonProperty(value = "refinements")
    private List<ResponseNumberRefinement> refinements;

    /**
     * Get the refinements value.
     *
     * @return the refinements value
     */
    public List<ResponseNumberRefinement> refinements() {
        return this.refinements;
    }

    /**
     * Set the refinements value.
     *
     * @param refinements the refinements value to set
     * @return the ResponseNumberFacet object itself.
     */
    public ResponseNumberFacet withRefinements(List<ResponseNumberRefinement> refinements) {
        this.refinements = refinements;
        return this;
    }

}

