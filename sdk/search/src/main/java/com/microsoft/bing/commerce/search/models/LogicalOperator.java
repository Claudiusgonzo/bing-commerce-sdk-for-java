// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LogicalOperator.
 */
public enum LogicalOperator {
    /** Enum value And. */
    AND("And"),

    /** Enum value Or. */
    OR("Or");

    /** The actual serialized value for a LogicalOperator instance. */
    private String value;

    LogicalOperator(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LogicalOperator instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LogicalOperator object, or null if unable to parse.
     */
    @JsonCreator
    public static LogicalOperator fromString(String value) {
        LogicalOperator[] items = LogicalOperator.values();
        for (LogicalOperator item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}