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
 * The SetConditionBase model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = SetConditionBase.class)
@JsonTypeName("SetConditionBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StringSetCondition", value = StringSetCondition.class)
})
public class SetConditionBase extends FieldConditionBase {
    /**
     * Possible values include: 'In', 'NotIn'.
     */
    @JsonProperty(value = "operator")
    private SetOperator operator;

    /**
     * Get possible values include: 'In', 'NotIn'.
     *
     * @return the operator value
     */
    public SetOperator operator() {
        return this.operator;
    }

    /**
     * Set possible values include: 'In', 'NotIn'.
     *
     * @param operator the operator value to set
     * @return the SetConditionBase object itself.
     */
    public SetConditionBase withOperator(SetOperator operator) {
        this.operator = operator;
        return this;
    }

}

