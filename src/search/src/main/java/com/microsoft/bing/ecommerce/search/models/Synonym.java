/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.ecommerce.search.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Synonym model.
 */
public class Synonym {
    /**
     * The synonymId property.
     */
    @JsonProperty(value = "synonymId")
    private String synonymId;

    /**
     * The synonyms property.
     */
    @JsonProperty(value = "synonyms")
    private List<String> synonyms;

    /**
     * Get the synonymId value.
     *
     * @return the synonymId value
     */
    public String synonymId() {
        return this.synonymId;
    }

    /**
     * Set the synonymId value.
     *
     * @param synonymId the synonymId value to set
     * @return the Synonym object itself.
     */
    public Synonym withSynonymId(String synonymId) {
        this.synonymId = synonymId;
        return this;
    }

    /**
     * Get the synonyms value.
     *
     * @return the synonyms value
     */
    public List<String> synonyms() {
        return this.synonyms;
    }

    /**
     * Set the synonyms value.
     *
     * @param synonyms the synonyms value to set
     * @return the Synonym object itself.
     */
    public Synonym withSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

}
