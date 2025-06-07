package com.company.validation.api.rule;

/**
 * Interface for validation rules that can be applied to attribute values.
 */
public interface ValidationRule {
    /**
     * Validates the given value.
     *
     * @param value the value to validate
     * @return true if the value is valid, false otherwise
     */
    boolean isValid(String value);

    /**
     * Gets the error message to display when validation fails.
     *
     * @return the error message
     */
    String getErrorMessage();
} 