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
 * Defines a facet with a range refinement.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ResponseRangeFacet.class)
@JsonTypeName("RangeFacet")
public class ResponseRangeFacet extends ResponseFacetBase {
    /**
     * The refinements property.
     */
    @JsonProperty(value = "refinements")
    private List<ResponseRangeRefinement> refinements;

    /**
     * Get the refinements value.
     *
     * @return the refinements value
     */
    public List<ResponseRangeRefinement> refinements() {
        return this.refinements;
    }

    /**
     * Set the refinements value.
     *
     * @param refinements the refinements value to set
     * @return the ResponseRangeFacet object itself.
     */
    public ResponseRangeFacet withRefinements(List<ResponseRangeRefinement> refinements) {
        this.refinements = refinements;
        return this;
    }

}

