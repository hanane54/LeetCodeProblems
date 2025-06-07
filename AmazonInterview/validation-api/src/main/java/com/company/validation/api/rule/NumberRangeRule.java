package com.company.validation.api.rule;

/**
 * Validates that a number falls within a specified range.
 */
public class NumberRangeRule implements ValidationRule {
    private final int min;
    private final int max;

    public NumberRangeRule(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isValid(String value) {
        try {
            int numValue = Integer.parseInt(value);
            return numValue >= min && numValue <= max;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String getErrorMessage() {
        return "Value must be between " + min + " and " + max;
    }
} 