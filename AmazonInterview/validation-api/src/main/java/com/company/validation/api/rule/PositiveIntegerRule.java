package com.company.validation.api.rule;

/**
 * Validates that a value is a positive integer.
 */
public class PositiveIntegerRule implements ValidationRule {
    @Override
    public boolean isValid(String value) {
        try {
            int numValue = Integer.parseInt(value);
            return numValue > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String getErrorMessage() {
        return "Value must be a positive integer";
    }
} 