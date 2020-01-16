// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines an inclusion condition for a category field. It can appear in a
 * filter, a boost, or a filter aggregation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = CategoryCondition.class)
@JsonTypeName("CategoryCondition")
public class CategoryCondition extends FieldConditionBase {
    /**
     * The category to match items against. The format for specifying
     * hierarchical categories is a pipe-delimited string, such as
     * `Meanswear|shirts|Dress Shirts`.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * The category operator to apply. Default is `In`. Possible values
     * include: 'In', 'NotIn'.
     */
    @JsonProperty(value = "operator")
    private CategoryOperator operator;

    /**
     * Get the category to match items against. The format for specifying hierarchical categories is a pipe-delimited string, such as `Meanswear|shirts|Dress Shirts`.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the category to match items against. The format for specifying hierarchical categories is a pipe-delimited string, such as `Meanswear|shirts|Dress Shirts`.
     *
     * @param value the value value to set
     * @return the CategoryCondition object itself.
     */
    public CategoryCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the category operator to apply. Default is `In`. Possible values include: 'In', 'NotIn'.
     *
     * @return the operator value
     */
    public CategoryOperator operator() {
        return this.operator;
    }

    /**
     * Set the category operator to apply. Default is `In`. Possible values include: 'In', 'NotIn'.
     *
     * @param operator the operator value to set
     * @return the CategoryCondition object itself.
     */
    public CategoryCondition withOperator(CategoryOperator operator) {
        this.operator = operator;
        return this;
    }

}

