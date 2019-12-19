/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.ecommerce.search.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The GeoBoundaryBase model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = GeoBoundaryBase.class)
@JsonTypeName("GeoBoundaryBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "GeoBoundingBox", value = GeoBoundingBox.class),
    @JsonSubTypes.Type(name = "GeoDistance", value = GeoDistance.class)
})
public class GeoBoundaryBase {
}

