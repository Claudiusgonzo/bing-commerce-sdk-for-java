// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.ingestion.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TransformationConfigResponse model.
 */
public class TransformationConfigResponse {
    /**
     * The contents of the transformation config that's being managed.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * An id that you can use to tryout your transformation on the cloud.
     */
    @JsonProperty(value = "tryOutId")
    private String tryOutId;

    /**
     * Get the contents of the transformation config that's being managed.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the contents of the transformation config that's being managed.
     *
     * @param value the value value to set
     * @return the TransformationConfigResponse object itself.
     */
    public TransformationConfigResponse withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get an id that you can use to tryout your transformation on the cloud.
     *
     * @return the tryOutId value
     */
    public String tryOutId() {
        return this.tryOutId;
    }

    /**
     * Set an id that you can use to tryout your transformation on the cloud.
     *
     * @param tryOutId the tryOutId value to set
     * @return the TransformationConfigResponse object itself.
     */
    public TransformationConfigResponse withTryOutId(String tryOutId) {
        this.tryOutId = tryOutId;
        return this;
    }

}
