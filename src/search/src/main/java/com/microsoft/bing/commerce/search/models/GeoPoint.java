/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a geo-location based on lattitude and longitude.
 */
public class GeoPoint {
    /**
     * The lattitude of the location.
     */
    @JsonProperty(value = "lat")
    private Double lat;

    /**
     * The longitude of the location.
     */
    @JsonProperty(value = "lon")
    private Double lon;

    /**
     * Get the lattitude of the location.
     *
     * @return the lat value
     */
    public Double lat() {
        return this.lat;
    }

    /**
     * Set the lattitude of the location.
     *
     * @param lat the lat value to set
     * @return the GeoPoint object itself.
     */
    public GeoPoint withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    /**
     * Get the longitude of the location.
     *
     * @return the lon value
     */
    public Double lon() {
        return this.lon;
    }

    /**
     * Set the longitude of the location.
     *
     * @param lon the lon value to set
     * @return the GeoPoint object itself.
     */
    public GeoPoint withLon(Double lon) {
        this.lon = lon;
        return this;
    }

}