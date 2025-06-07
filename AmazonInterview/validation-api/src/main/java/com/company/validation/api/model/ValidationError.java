package com.company.validation.api.model;

/**
 * Represents a validation error with attribute name, value, and error message.
 */
public class ValidationError {
    private final String attributeName;
    private final String attributeValue;
    private final String errorMessage;

    public ValidationError(String attributeName, String attributeValue, String errorMessage) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return String.format("Validation error for %s='%s': %s",
            attributeName, attributeValue, errorMessage);
    }
} 