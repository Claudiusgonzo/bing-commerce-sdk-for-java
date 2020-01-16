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
 * Defines a facet refinement on a category field.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ResponseCategoryRefinement.class)
@JsonTypeName("CategoryRefinement")
public class ResponseCategoryRefinement extends ResponseStringRefinement {
    /**
     * A list of child category refinements.
     */
    @JsonProperty(value = "refinements")
    private List<ResponseCategoryRefinement> refinements;

    /**
     * Get a list of child category refinements.
     *
     * @return the refinements value
     */
    public List<ResponseCategoryRefinement> refinements() {
        return this.refinements;
    }

    /**
     * Set a list of child category refinements.
     *
     * @param refinements the refinements value to set
     * @return the ResponseCategoryRefinement object itself.
     */
    public ResponseCategoryRefinement withRefinements(List<ResponseCategoryRefinement> refinements) {
        this.refinements = refinements;
        return this;
    }

}

