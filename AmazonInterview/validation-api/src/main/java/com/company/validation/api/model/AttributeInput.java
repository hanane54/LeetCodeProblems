package com.company.validation.api.model;

/**
 * Represents an input attribute with a name and value.
 */
public class AttributeInput {
    private final String attributeName;
    private final String attributeValue;

    public AttributeInput(String attributeName, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }
} 